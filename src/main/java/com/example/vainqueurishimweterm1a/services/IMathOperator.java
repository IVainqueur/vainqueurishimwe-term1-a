package com.example.vainqueurishimweterm1a.services;

import com.example.vainqueurishimweterm1a.exceptions.InvalidOperationException;

public interface IMathOperator {

    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
