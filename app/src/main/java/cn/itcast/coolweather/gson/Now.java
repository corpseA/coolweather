package cn.itcast.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by J on 2019/5/17.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
