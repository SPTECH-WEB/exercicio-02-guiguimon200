package com.example.atividade.sprint2.service;

import org.springframework.stereotype.Component;

@Component("entregaEstrangeira")
public class EntregaEstrangeira {

    public Double calcularEntregaEstrangeira(double peso) {
        return peso * 1.8 + 5;
    }

    public String modalidade() {
        return "Entrega Estrangeira";
    }
}
