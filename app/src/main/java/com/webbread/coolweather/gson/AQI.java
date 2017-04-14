package com.webbread.coolweather.gson;

/**
 * Created by webbread on 2017/4/13.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
