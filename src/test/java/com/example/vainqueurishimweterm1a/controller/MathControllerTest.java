package com.example.vainqueurishimweterm1a.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.vainqueurishimweterm1a.dtos.DoMathRequestDto;
import com.example.vainqueurishimweterm1a.payload.ApiResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void integ_add_successfully(){
        DoMathRequestDto dto = new DoMathRequestDto(14, 4, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void integ_subtract_successfully(){
        DoMathRequestDto dto = new DoMathRequestDto(14, 4, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void integ_multiply_successfully(){
        DoMathRequestDto dto = new DoMathRequestDto(14, 4, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void integ_divide_successfully(){
        DoMathRequestDto dto = new DoMathRequestDto(14, 4, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(200, response.getStatusCode().value());
    }
}
