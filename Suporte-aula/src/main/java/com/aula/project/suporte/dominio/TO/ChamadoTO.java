package com.aula.project.suporte.dominio.TO;

import com.aula.project.suporte.dominio.Chamados;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ChamadoTO {
    protected int id;
    protected LocalDate dataAbertura = LocalDate.now();
    protected LocalDate dataFechamento = LocalDate.now();
    protected String prioridade;
    protected String status;
    protected String title;
    protected String observacao;
    protected String nomeCliente;
    protected String nomeTecnico;

    protected Integer idCliente;

    public ChamadoTO(Chamados obj) {
        super();
        this.id = obj.getId();
        this.dataAbertura = obj.getDataAbertura();
        this.dataFechamento = obj.getDataFechamento();
        this.idCliente = obj.getCliente().getId();
        this.nomeCliente = obj.getCliente().getName();
        this.nomeTecnico = obj.getTecnico().getName();
        this.title = obj.getTitle();
        this.status = obj.getStatus();
        this.observacao = obj.getObservacao();
        this.prioridade = obj.getPrioridade();
    }

    public ChamadoTO() {
        super();
    }
}
