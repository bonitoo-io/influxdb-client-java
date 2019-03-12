/*
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.influxdata.client;

import javax.annotation.Nonnull;

import org.influxdata.Arguments;
import org.influxdata.client.domain.OnboardingRequest;
import org.influxdata.client.domain.OnboardingResponse;
import org.influxdata.client.internal.InfluxDBClientImpl;

/**
 * The Factory that create a instance of a InfluxDB 2.0 client.
 *
 * @author Jakub Bednar (bednar@github) (05/09/2018 10:04)
 */
public final class InfluxDBClientFactory {

    private InfluxDBClientFactory() {
    }

    /**
     * Create a instance of the InfluxDB 2.0 client.
     *
     * @param url      the url to connect to the InfluxDB
     * @return client
     * @see InfluxDBClientOptions.Builder#url(String)
     */
    @Nonnull
    public static InfluxDBClient create(@Nonnull final String url) {

        InfluxDBClientOptions options = InfluxDBClientOptions.builder()
                .url(url)
                .build();

        return create(options);
    }

    /**
     * Create a instance of the InfluxDB 2.0 client.
     *
     * @param url      the url to connect to the InfluxDB
     * @param username the username to use in the basic auth
     * @param password the password to use in the basic auth
     * @return client
     * @see InfluxDBClientOptions.Builder#url(String)
     */
    @Nonnull
    public static InfluxDBClient create(@Nonnull final String url,
                                        @Nonnull final String username,
                                        @Nonnull final char[] password) {

        InfluxDBClientOptions options = InfluxDBClientOptions.builder()
                .url(url)
                .authenticate(username, password)
                .build();

        return create(options);
    }

    /**
     * Create a instance of the InfluxDB 2.0 client.
     *
     * @param url      the url to connect to the InfluxDB
     * @param token    the token to use for the authorization
     * @return client
     * @see InfluxDBClientOptions.Builder#url(String)
     */
    @Nonnull
    public static InfluxDBClient create(@Nonnull final String url, @Nonnull final char[] token) {

        InfluxDBClientOptions options = InfluxDBClientOptions.builder()
                .url(url)
                .authenticateToken(token)
                .build();

        return create(options);
    }

    /**
     * Create a instance of the InfluxDB 2.0 client.
     *
     * @param options the connection configuration
     * @return client
     */
    @Nonnull
    public static InfluxDBClient create(@Nonnull final InfluxDBClientOptions options) {

        Arguments.checkNotNull(options, "InfluxDBClientOptions");

        return new InfluxDBClientImpl(options);
    }

    /**
     * Post onboarding request, to setup initial user, org and bucket.
     *
     * @param url      the url to connect to the InfluxDB
     * @param username the name of an user
     * @param password the password to connect as an user
     * @param org      the name of an organization
     * @param bucket   the name of a bucket
     * @return Created default user, bucket, org.
     */
    @Nonnull
    public static OnboardingResponse onBoarding(@Nonnull final String url,
                                                @Nonnull final String username,
                                                @Nonnull final String password,
                                                @Nonnull final String org,
                                                @Nonnull final String bucket) {

        Arguments.checkNonEmpty(url, "url");
        Arguments.checkNonEmpty(username, "username");
        Arguments.checkNonEmpty(password, "password");
        Arguments.checkNonEmpty(org, "org");
        Arguments.checkNonEmpty(bucket, "bucket");

        OnboardingRequest onboarding = new OnboardingRequest();
        onboarding.setUsername(username);
        onboarding.setPassword(password);
        onboarding.setOrg(org);
        onboarding.setBucket(bucket);

        return onBoarding(url, onboarding);
    }


    /**
     * Post onboarding request, to setup initial user, org and bucket.
     *
     * @param url        the url to connect to the InfluxDB
     * @param onboarding the defaults
     * @return Created default user, bucket, org.
     */
    @Nonnull
    public static OnboardingResponse onBoarding(@Nonnull final String url,
                                                @Nonnull final OnboardingRequest onboarding) {
        Arguments.checkNonEmpty(url, "url");
        Arguments.checkNotNull(onboarding, "onboarding");

        try (InfluxDBClientImpl client = new InfluxDBClientImpl(InfluxDBClientOptions.builder().url(url).build())) {

            return client.onBoarding(onboarding);
        }
    }
}