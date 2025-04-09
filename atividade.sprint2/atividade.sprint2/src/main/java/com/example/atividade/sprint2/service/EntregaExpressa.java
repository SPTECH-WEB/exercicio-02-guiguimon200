package com.example.atividade.sprint2.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements EntregaStrategy {

    @Override
    public double calcular (double peso) {
        return peso * 1.5 + 7.0;
    }

    @Override
    public String modalidade() {
        return "Expressa";
    }
}
