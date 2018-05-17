package com.tinyfive.weatherandmemorandum.util.network.netWorkFrame;

import com.tinyfive.weatherandmemorandum.util.network.netWorkInterface.NetWorkService;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by wj on 2018/5/17.
 */

public class OkHttpServiceImp implements NetWorkService<String> {

    private OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                                        .connectTimeout(10, TimeUnit.SECONDS)
                                        .build();

    @Override
    public String getSyncRequest(String url, String params) {
        try {
            //创建 request 对象
            Request request = new Request.Builder()
                    .url(url)//请求接口。如果需要传参拼接到接口后面。
                    .build();//创建Request 对象
            // 创建 response 对象
            Response response = null;
            okHttpClient.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    System.out.print("Error:"+e.getMessage());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
//                        String s = response.body().string();
                    }
                }
            });
    /*        response = okHttpClient.newCall(request).execute();
            //请求成功
            if (response.isSuccessful()) {
                //获取返回信息体
                String responseStr = response.body().toString();
                return responseStr;
            } else {
                throw new IOException("Unexpected code " + response);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    @Override
    public String postSyncRequest(String url, String params) {
        return null;
    }
}
