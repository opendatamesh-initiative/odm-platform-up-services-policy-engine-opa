package org.opendatamesh.platform.adapter.validator.opa.server.opaclient;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

public class OpaRestTemplate {

    Long timeout;

    RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();

    public OpaRestTemplate(Long timeout) {
        this.timeout = timeout;
    }

    public RestTemplate buildRestTemplate() {
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(timeout))
                .setReadTimeout(Duration.ofSeconds(timeout))
                .errorHandler(new OpaRestTemplateResponseErrorHandler())
                .build();
    }

}
