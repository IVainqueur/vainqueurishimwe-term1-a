package com.example.vainqueurishimweterm1a;

import com.example.vainqueurishimweterm1a.controllers.MathController;
import com.example.vainqueurishimweterm1a.dtos.DoMathRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MathController.class)
public class MathOperationsEndToEndTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testMathController() throws Exception {
        DoMathRequestDto dto = new DoMathRequestDto(14, 4, "+");
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/api/v1/do_math")
                .content(objectMapper.writeValueAsString(dto));
        mockMvc.perform(request)
                .andExpect(status().isCreated());
    }

}
