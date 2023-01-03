package com.example.currencyconvert.api;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CurrencyInterface {
    @GET("/wtbpv1xZaoP5ak1EqVYtY341lPfCpm8N/{currency}")
    Call<JsonObject> getExchangeCurrency(@Path("currency") String currency);
}

