package com.example.atividade.sprint2.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {

    private final List<EntregaStrategy> entregaCusto;

    public EntregaService(List<EntregaStrategy> entregaCusto) {
        this.entregaCusto = entregaCusto;
    }

    public double calcular(String modalidade, double peso) {
        return entregaCusto.stream().filter(e -> e.modalidade().equalsIgnoreCase(modalidade)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Modalidade de entrega não encontrada")).calcular(peso);
    }
}
