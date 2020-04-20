package com.wcx.designsupportdemo.interfae;

import com.wcx.designsupportdemo.data.MovieSubject;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 王彩霞
 * @data 2019/3/21
 * @describe
 */
public interface MovieService {
    //获取豆瓣Top250 榜单


    //    @GET("top250")
//    Call<MovieSubject> getTop250(@Query("start") int start, @Query("count")int count);
    @GET("top250")
    Observable<MovieSubject> getTop250(@Query("start") int start, @Query("count") int count);


//    @FormUrlEncoded
//    @POST("top250")
//    Observable<MovieSubject> getTop250(@Field("start") int start, @Field("count") int count);
    //使用POST 请求方式时，只需要更改方法定义的标签，用@POST 标签，参数标签用 @Field 或者@Body或者FieldMap
    // 注意：使用POST 方式时注意2点，1，必须加上 @FormUrlEncoded标签，否则会抛异常。
    //                          2，使用POST方式时，必须要有参数，否则会抛异常

}
