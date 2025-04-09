package com.example.atividade.sprint2.service;

import org.springframework.stereotype.Service;

@Service("EntregaEstrangeira")
public class EntregaAdapter implements EntregaStrategy {

    private final EntregaEstrangeira entregaEstrangeira;

    public EntregaAdapter(){
        this.entregaEstrangeira = new EntregaEstrangeira();
    }

    @Override
    public String modalidade() {
        return "EntregaEstrangeira";
    }

    @Override
    public double calcular(double peso) {
        return entregaEstrangeira.calcularEntregaEstrangeira(peso);
    }
}
