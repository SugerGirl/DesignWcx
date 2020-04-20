package com.wcx.designsupportdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wcx.designsupportdemo.R;
import com.wcx.designsupportdemo.interfae.MovieService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class DouBanTopActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://api.douban.com/v2/movie/";
    public static final String TAG = "DouBanTopActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dou_ban_top);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//配合rxjava使用
                .addConverterFactory(GsonConverterFactory.create())//转换器，将json转换成javabean
                .build();


        MovieService movieService = retrofit.create(MovieService.class);

//        Subscription subscription = movieService.getTop250(0, 20)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<MovieSubject>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(MovieSubject movieSubject) {
//
//                    }
//                });

//        BookService bookService = retrofit.create(BookService.class);
//        Call<ResponseBody> call=bookService.getBook(1220562);
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    String s=response.body().string();
//                    Log.e(TAG,s);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Log.e(TAG,t.toString());
//            }
//        });

//        //调用方法得到一个Call
//        Call<MovieSubject> call = movieService.getTop250( 0,1);
//        //进行网络请求
//
//        call.enqueue(new Callback<MovieSubject>() {
//            @Override
//            public void onResponse(Call<MovieSubject> call, Response<MovieSubject> response) {
//                    String s=response.body().toString();
//
//                    Log.e(TAG,s);
//            }
//
//            @Override
//            public void onFailure(Call<MovieSubject> call, Throwable t) {
//                Log.e(TAG,t.toString());
//            }
//        });

    }

}


