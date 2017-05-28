package com.example.admin.successapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.admin.successapp.core.domain.Target;
import com.example.admin.successapp.infra.JpaTargetRepository;
import com.example.admin.successapp.infra.http.Message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAddTargetYear = (Button) findViewById(R.id.btnAddTargetYear);
        final JpaTargetRepository targetRepository = new JpaTargetRepository();
        btnAddTargetYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Target target = new Target();
                target.setId(0);
                target.setParentId(0);
                target.setExpiryDate("18:30:00_15/04/2017");
                target.setName("Độ cha mẹ thành công");
                target.setLevel(0);
                target.setTitle("Năm 2017");
                target.defailtStatus();
                Message message = targetRepository.add(target);
            }
        });
    }
}
