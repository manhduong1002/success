package com.example.admin.successapp.infra;

import android.util.Log;

import com.example.admin.successapp.core.domain.Target;
import com.example.admin.successapp.core.domain.repository.TargetRepository;
import com.example.admin.successapp.infra.http.Message;
import com.example.admin.successapp.infra.http.RetroClient;
import com.example.admin.successapp.infra.http.ServiceInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Thanh Tung iTC on 5/27/2017.
 */

public class JpaTargetRepository implements TargetRepository {

    Message message = null;
    @Override
    public Message add(Target target) {
        ServiceInterface api = RetroClient.getApiService();
        Log.v("OK","OK");
        Call<Message> call = api.addTarget(target.getId(), target.getLevel(), target.getExpiryDate(),target.getTitle(),target.getName(),target.getParentId());
        call.enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                if (response.isSuccessful()) {
                    message = response.body();
                    Log.v("OK",message.getErrorDescription()+ message.getContent());
                }
            }
            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                message= null;
                Log.v("FAIL","FAIL"+t.getMessage());
            }
        });
        return message;
    }
}
