package com.influxdb.client.service;

import com.influxdb.client.domain.Buckets;
import com.influxdb.client.domain.HealthCheck;
import com.influxdb.client.domain.Source;
import com.influxdb.client.domain.Sources;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

public interface SourcesService {
  /**
   * Delete a source
   * 
   * @param sourceID ID of the source (required)
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("api/v2/sources/{sourceID}")
  Call<Void> deleteSourcesID(
    @retrofit2.http.Path("sourceID") String sourceID, @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

  /**
   * Get all sources
   * 
   * @param zapTraceSpan OpenTracing span context (optional)
   * @param org specifies the organization of the resource (optional)
   * @return Call&lt;Sources&gt;
   */
  @GET("api/v2/sources")
  Call<Sources> getSources(
    @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan, @retrofit2.http.Query("org") String org
  );

  /**
   * Get a source
   * 
   * @param sourceID ID of the source (required)
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;Source&gt;
   */
  @GET("api/v2/sources/{sourceID}")
  Call<Source> getSourcesID(
    @retrofit2.http.Path("sourceID") String sourceID, @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

  /**
   * Get a sources buckets (will return dbrps in the form of buckets if it is a v1 source)
   * 
   * @param sourceID ID of the source (required)
   * @param zapTraceSpan OpenTracing span context (optional)
   * @param org specifies the organization of the resource (optional)
   * @return Call&lt;Buckets&gt;
   */
  @GET("api/v2/sources/{sourceID}/buckets")
  Call<Buckets> getSourcesIDBuckets(
    @retrofit2.http.Path("sourceID") String sourceID, @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan, @retrofit2.http.Query("org") String org
  );

  /**
   * Get a sources health
   * 
   * @param sourceID ID of the source (required)
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;HealthCheck&gt;
   */
  @GET("api/v2/sources/{sourceID}/health")
  Call<HealthCheck> getSourcesIDHealth(
    @retrofit2.http.Path("sourceID") String sourceID, @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

  /**
   * Updates a Source
   * 
   * @param sourceID ID of the source (required)
   * @param source source update (required)
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;Source&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/v2/sources/{sourceID}")
  Call<Source> patchSourcesID(
    @retrofit2.http.Path("sourceID") String sourceID, @retrofit2.http.Body Source source, @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

  /**
   * Creates a Source
   * 
   * @param source source to create (required)
   * @param zapTraceSpan OpenTracing span context (optional)
   * @return Call&lt;Source&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/v2/sources")
  Call<Source> postSources(
    @retrofit2.http.Body Source source, @retrofit2.http.Header("Zap-Trace-Span") String zapTraceSpan
  );

}
