package com.example.vainqueurishimweterm1a.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.vainqueurishimweterm1a.dtos.DoMathRequestDto;
import com.example.vainqueurishimweterm1a.exceptions.InvalidOperationException;
import com.example.vainqueurishimweterm1a.payload.ApiResponse;
import com.example.vainqueurishimweterm1a.serviceImpls.MathOperatorImpl;

@RestController
@RequestMapping("/api/v1/do_math")
public class MathController {
    private final MathOperatorImpl mathOperatorImpl;

    public MathController(MathOperatorImpl mathOperatorImpl) {
        this.mathOperatorImpl = mathOperatorImpl;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> create(@RequestBody DoMathRequestDto dto) throws InvalidOperationException {
        return ResponseEntity.ok(ApiResponse.success(mathOperatorImpl.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
    }
}
