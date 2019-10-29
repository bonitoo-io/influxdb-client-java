package com.influxdb.client.service;

import com.influxdb.client.domain.Routes;

import retrofit2.Call;
import retrofit2.http.*;

public interface DefaultService {
  /**
   * Map of all top level routes available
   * 
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;Routes&gt;
   */
  @GET("api/v2/")
  Call<Routes> getRoutes(
    @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

  /**
   * Exchange basic auth credentials for session
   * 
   * @param zapTraceSpan OpenTracing span context (optional)
   * @param authorization An auth credential for the Basic scheme (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("api/v2/signin")
  Call<Void> postSignin(
    @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan, @retrofit2.http.Header("Authorization") String authorization
  );

  /**
   * Expire the current session
   * 
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("api/v2/signout")
  Call<Void> postSignout(
    @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

}
