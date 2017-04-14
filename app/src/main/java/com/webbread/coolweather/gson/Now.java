package com.webbread.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by webbread on 2017/4/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
