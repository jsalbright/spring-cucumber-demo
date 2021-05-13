package com.discover.ulogin.bdd;

import io.cucumber.spring.CucumberContextConfiguration;
import com.discover.ulogin.UniversalLoginApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;

@ContextConfiguration
@CucumberContextConfiguration
@SpringBootTest(classes = {UniversalLoginApp.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CucumberSpringContextConfiguration {

    @Autowired
    protected TestRestTemplate restTemplate;

    private ResponseEntity<String> response = null;

    public HttpHeaders getDefaultHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

    public ResponseEntity<String> invokeRESTCall(String url, HttpMethod method, HttpEntity<?> requestEntity) {

		return restTemplate.exchange(url, method, requestEntity, String.class);
	}

}
