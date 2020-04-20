package com.wcx.designsupportdemo.interfae;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author 王彩霞
 * @data 2019/3/21
 * @describe
 */
public interface BookService {
    //获取豆瓣Top250 榜单
    @GET("book/{id}")
    Call<ResponseBody> getBook(@Path("id") int id);
}
