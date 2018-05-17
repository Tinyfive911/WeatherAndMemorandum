package com.tinyfive.weatherandmemorandum.util.network.netWorkInterface;

import org.json.JSONObject;

/**
 * Created by wj on 2018/5/17.
 */

public interface NetWorkService<T> {

    /**
     * 同步get请求
     * @param url
     * @param params
     * @return
     */
    public String getSyncRequest(String url,T params);

    /**
     * 同步post请求
     * @param url
     * @param params
     * @return
     */
    public String postSyncRequest(String url,T params);



}
