package com.webbread.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by webbread on 2017/4/13.
 */

public class Basic {
    //字符名称映射
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weterId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
