package com.example.gerenciamentotarefas.entity;
import com.example.gerenciamentotarefas.entity.Enum.Prioridade;
import com.example.gerenciamentotarefas.entity.Enum.Status;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeVencimento;
    private Status status;
    private Prioridade prioridade;
    private String responsavel;
    private LocalDateTime dataDaCriacao;
    private LocalDateTime dataDaConclusao;
}
