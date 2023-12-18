package com.example.vainqueurishimweterm1a.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.vainqueurishimweterm1a.dtos.DoMathRequestDto;
import com.example.vainqueurishimweterm1a.exceptions.InvalidOperationException;
import com.example.vainqueurishimweterm1a.serviceImpls.MathOperatorImpl;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @Mock
    private MathOperatorImpl mathOperatorService;

    @Test
    public void should_add_properly() throws InvalidOperationException {
        double operator1 = 4;
        double operator2 = 18;
        String operation = "+";
        double expectedResult = 22.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    @Test
    public void should_subtract_properly() throws InvalidOperationException {
        double operator1 = 5;
        double operator2 = 34;
        String operation = "-";
        double expectedResult = -29.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    @Test
    public void should_multiply_properly() throws InvalidOperationException {
        double operator1 = 68;
        double operator2 = 2;
        String operation = "*";
        double expectedResult = 136.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    @Test
    public void should_divide_properly() throws InvalidOperationException {
        double operator1 = 56;
        double operator2 = 4;
        String operation = "/";
        double expectedResult = 14;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
}