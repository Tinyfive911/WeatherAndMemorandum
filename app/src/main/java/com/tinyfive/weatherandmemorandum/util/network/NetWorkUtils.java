package com.tinyfive.weatherandmemorandum.util.network;

import com.tinyfive.weatherandmemorandum.util.network.netWorkFrame.OkHttpServiceImp;

/**
 * Created by wj on 2018/5/17.
 */

public class NetWorkUtils {
    //单例对象
    private static NetWorkUtils netWorkUtils;
    //网络请求框架
    private OkHttpServiceImp okHttpClient;

    /**
     * 单例模式入口
     *
     * @return
     */
    public static NetWorkUtils getInstance() {
        if (netWorkUtils == null) {
            netWorkUtils = new NetWorkUtils();
        }
        return netWorkUtils;
    }

    //构造方法
    private NetWorkUtils() {
        //初始化
        init();
    }

    /**
     * 初始化 一些需要的工具类
     */
    private void init() {
        okHttpClient = new OkHttpServiceImp();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 获取数据源
     * @return
     */
    public  String getDataSourceByOKHttp(String url){
       return okHttpClient.getSyncRequest(url,null);
    }
}
