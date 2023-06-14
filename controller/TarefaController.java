package com.example.gerenciamentotarefas.controller;

import com.example.gerenciamentotarefas.entity.Tarefa;
import com.example.gerenciamentotarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")

public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("tarefas")
    public List<Tarefa> listarTarefas() {
        return tarefaService.buscarTarefas();
    }

    @GetMapping("tarefa/{id}")
    public Tarefa buscarTarefaPorId(@PathVariable Long id) {
        return tarefaService.buscarTarefaPorId(id);
    }

    @PostMapping("tarefa")
    public Tarefa salvarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.adicionarTarefa(tarefa);
    }
    @PutMapping("atualizar/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return tarefaService.atualizarTarefa(id, tarefa);
    }
}

