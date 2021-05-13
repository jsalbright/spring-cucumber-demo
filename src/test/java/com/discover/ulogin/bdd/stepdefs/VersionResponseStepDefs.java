package com.discover.ulogin.bdd.stepdefs;

import com.discover.ulogin.bdd.CucumberSpringContextConfiguration;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.After;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.assertj.core.api.Assertions.assertThat;



public class VersionResponseStepDefs extends CucumberSpringContextConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @LocalServerPort
    String port;

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response = null;

    @After
    public void teardown() {
        logger.info("Tearing down test resources...");
    }

    @Given("a user who wants to know the version of the API")
    public void a_user_who_wants_to_know_the_version_of_the_api() {
        HttpEntity<?> requestEntity = new HttpEntity<>(new HashMap<String,String>(), getDefaultHttpHeaders());
        response = invokeRESTCall("http://localhost:" + port + "/login", HttpMethod.GET, requestEntity);
    }

    @When("user requests the version with \\/version")
    public void user_requests_the_version_with_version() {
       
    }

    @Then("version API response should respond with a Double-formatted value")
    public void version_api_response_should_respond_with_a_double_formatted_value() {

    }

    @Then("version API response should end with a newline character")
    public void version_api_response_should_end_with_a_newline_character() {

    }


}
