package com.example.codefest.springcloudapigateway;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.cloud.gateway.config.HttpClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.http.client.HttpClient;

@Configuration
public class HttpClientResolverFixConfig {

    @Bean
    public HttpClientCustomizer httpClientResolverCustomizer() {
        return new HttpClientCustomizer() {

            @Override
            public HttpClient customize(HttpClient httpClient) {
                return httpClient.resolver(DefaultAddressResolverGroup.INSTANCE);
            }
        };
    }

}
