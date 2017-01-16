package com.xiao.loghttpinfo.http;

import com.xiao.loghttpinfo.bean.Kuaidi;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by XiaoJianjun on 2017/1/16.
 */
public interface ApiService {

    @FormUrlEncoded
    @POST(Api.PartUrl.QUERY)
    Observable<Kuaidi> query(@Field("key") String key, @Field("dtype") String dType, @Field("q") String name);
}
