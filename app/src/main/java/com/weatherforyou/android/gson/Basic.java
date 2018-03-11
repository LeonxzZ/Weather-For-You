package com.weatherforyou.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xzz on 2018/3/11.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
