package com.example.atividade.sprint2.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaTransportadora implements EntregaStrategy {

    @Override
    public double calcular (double peso) {
        return peso * 2.0;
    }

    @Override
    public String modalidade() {
        return "Transportadora";
    }
}
