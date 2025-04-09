package com.example.atividade.sprint2.controller;

import com.example.atividade.sprint2.service.EntregaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    private final EntregaService entregaService;

    public EntregaController(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    public String calcularEntrega(@RequestParam String modalidade, @RequestParam double peso) {
        double valor = entregaService.calcular(modalidade, peso);
        return "A entrega de modalidade: (" + modalidade + ") para o peso de (" + peso +")kg vai custar R$: " + valor;
    }
}
