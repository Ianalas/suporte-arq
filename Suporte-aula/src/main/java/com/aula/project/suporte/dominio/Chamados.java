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
    private int id;
    @JsonFormat
    private LocalDate dataAbertura = LocalDate.now();

    private String prioridade;
    private String status;
    private String title;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Cliente usuario;
}
