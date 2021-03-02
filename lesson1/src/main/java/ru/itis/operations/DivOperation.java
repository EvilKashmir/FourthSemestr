package ru.itis.operations;

import org.springframework.stereotype.Component;

@Component
public class DivOperation {
    public double calculate(double a, double b) {
        return a / b;
    }
}
