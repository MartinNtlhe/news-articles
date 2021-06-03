package com.martinntlhe.newsapp.api;

import com.martinntlhe.newsapp.models.ArticleNews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("1.json")
    Call<ArticleNews> getDefaultArticles(@Query("api-key") String apiKey );

    @GET("7.json")
    Call<ArticleNews> getAll7DaysArticles(@Query("api-key") String apiKey);

    @GET("30.json")
    Call<ArticleNews> get30DaysArticles(@Query("api-key") String apiKey );
}
