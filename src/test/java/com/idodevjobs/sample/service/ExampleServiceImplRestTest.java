package com.idodevjobs.sample.service;

import com.idodevjobs.sample.model.ExampleModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml"})
public class ExampleServiceImplRestTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testCxfRestService() {
        ResponseEntity<ExampleModel> entity = restTemplate.getForEntity("http://localhost:8080/spring-cxf-rest-example/services/example/1", ExampleModel.class);

        assertThat(entity.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
