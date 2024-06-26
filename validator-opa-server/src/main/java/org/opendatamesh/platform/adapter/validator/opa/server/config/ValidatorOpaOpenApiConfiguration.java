package org.opendatamesh.platform.adapter.validator.opa.server.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatorOpaOpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("ODM Platform Adapter Validator OPA API Reference")
                        .summary("This page describe tha API exposed by the Validator OPA Server of the Adapters of the Utility Plane " +
                                "of the Open Data Mesh Platform.")
                        .description(
                                "This page describe tha API exposed by the Validator OPA Server of the Adapters of the Utility Plane of the Open Data Mesh Platform." +

                                "\r\n# Overview" +
                                "\r\nThe Validator OPA Module of the Open Data Mesh platform manages the evaluation requests for OPA policies"
                        )
                        .version("0.9.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .contact(new Contact()
                                .name("ODM Platform Team")
                                .email("odm.info@quantyca.it"))
                ).externalDocs(new ExternalDocumentation()
                        .description("Open Data Mesh Platform Documentation")
                        .url("https://dpds.opendatamesh.org/")
                );
    }

}

