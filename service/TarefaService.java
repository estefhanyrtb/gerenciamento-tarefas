package com.example.gerenciamentotarefas.service;

import com.example.gerenciamentotarefas.entity.Tarefa;
import com.example.gerenciamentotarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarTarefas() {
        return tarefaRepository.buscarTarefas();
    }

    public Tarefa buscarTarefaPorId(Long id) {
        return tarefaRepository.buscarTarefaPorId(id);
    }
    public Tarefa atualizarTarefa(long id, Tarefa tarefa){
        return  tarefaRepository.AtualizarTarefa(id, tarefa);
        }
    public Tarefa adicionarTarefa(Tarefa tarefa){
        return tarefaRepository.adicionarTarefa(tarefa);
    }
    }


