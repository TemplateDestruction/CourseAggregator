package com.breakout.bestappone.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ApiKeyInterceptorEdX implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request().newBuilder()
                .addHeader("Authorization", "JWT eyJhbGciOiJIUzI1NiJ9.eyJzY29wZXMiOiBbInJlYWQiLCAid3JpdGUiLCAicHJvZmlsZSIsICJlbWFpbCJdLCAiYWRtaW5pc3RyYXRvciI6IGZhbHNlLCAicHJlZmVycmVkX3VzZXJuYW1lIjogIkJlc3RCcmVha291dCIsICJmaWx0ZXJzIjogW10sICJpYXQiOiAxNTUxNDY2NDU0LCAic3ViIjogIjYzMmQyZDkzMzRjMjkzMTUzYzFkZTlmZWYyYjI0Yjk5IiwgImZhbWlseV9uYW1lIjogIlZlcmlqbmlrb3YiLCAiYXVkIjogInJpbm15YnllZG51YXc1cGhsaWRDb2NEdWRieWxiT2JEaWJKb2Rib3NnZXRzRWJhbGQ0IiwgImlzcyI6ICJodHRwczovL2NvdXJzZXMuZWR4Lm9yZy9vYXV0aDIiLCAiZW1haWxfdmVyaWZpZWQiOiB0cnVlLCAibmFtZSI6ICJBbGV4IFZlcmlqbmlrb3YiLCAidmVyc2lvbiI6ICIxLjEuMCIsICJnaXZlbl9uYW1lIjogIkFsZXgiLCAiZXhwIjogMTU1MTQ3MDA1NCwgImlzX3Jlc3RyaWN0ZWQiOiBmYWxzZSwgImVtYWlsIjogImthcmFiZHVzQHlhbmRleC5ydSJ9.m0ZZthD1B8BIPgCkl8tNgS3_Y5_8Ffgn9A56AU9SC1Y")
                .build();
        return chain.proceed(request);
    }
}
