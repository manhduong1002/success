package com.example.admin.successapp.infra.http;

import android.support.annotation.Nullable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Thanh Tung iTC on 5/27/2017.
 */

public class Message implements Serializable {
    @SerializedName("errorCode")
    @Expose
    @Nullable
    private String errorCode;

    @SerializedName("errorDescription")
    @Expose
    @Nullable
    private String errorDescription;

    @SerializedName("content")
    @Expose
    @Nullable
    private String content;

    public Message() {
    }

    @Nullable
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(@Nullable String errorCode) {
        this.errorCode = errorCode;
    }

    @Nullable
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(@Nullable String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Nullable
    public String getContent() {
        return content;
    }

    public void setContent(@Nullable String content) {
        this.content = content;
    }
}
