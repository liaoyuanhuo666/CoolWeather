package com.example.hasee.coolweather.util;

/**
 * Created by hasee on 2016/8/25.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
