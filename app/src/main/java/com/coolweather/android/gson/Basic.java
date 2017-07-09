package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2017/7/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updatetime;
    }
}
