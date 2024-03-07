package com.trly.gradlebuild.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureWebTestClient
public class GradleControllerTest {
    @Autowired
    private WebTestClient webTestClient;
    
    @Test
    void shouldCallGetEndpoint() {
        var actual = webTestClient.get()
        .uri("/hello/scrooge")
        .exchange()
        .returnResult(String.class);
        
        
        assertThat(actual.getResponseBody().blockFirst()).isEqualTo("Hello scrooge");
        
    }
}