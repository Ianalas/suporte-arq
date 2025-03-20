package com.aula.project.suporte.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Chamados implements Serializable {

    @Id
    @GeneratedValue
    protected int id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataAbertura = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataFechamento = LocalDate.now();

    protected String prioridade;
    protected String status;
    protected String title;
    protected String observacao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    protected Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    protected Tecnico tecnico;


    public Chamados(int id, LocalDate dataAbertura, LocalDate dataFechamento, String prioridade, String status, String title, String observacao, Cliente cliente, Tecnico tecnico) {
        super();

        this.id = id;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.prioridade = prioridade;
        this.status = status;
        this.title = title;
        this.observacao = observacao;
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public Chamados() {
        super();
    }
}
