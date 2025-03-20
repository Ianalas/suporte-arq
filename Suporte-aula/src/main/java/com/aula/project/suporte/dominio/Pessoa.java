package com.aula.project.suporte.dominio;

import com.aula.project.suporte.dominio.enumeracao.Perfil;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
public abstract class Pessoa {

    @Id
    @GeneratedValue
    protected int id;
    @Column(name = "endereco")
    protected String endereco;
    @Column(name = "name")
    protected String name;
    @Column(name = "email")
    protected String email;
    @Column(name = "phone")
    protected String phone;
    @Column(name = "cpf")
    protected String cpf;
    @Column(name = "senha")
    protected String senha;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataCriacao = LocalDate.now();

    @Getter
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "perfil")
    @Enumerated(EnumType.STRING)
    protected Set<Perfil> perfil = new HashSet<>();

    public void addPerfil(Perfil perfil) {
        this.perfil.add(perfil);
    }

    public Pessoa() {

    }

    public Pessoa(int id, String endereco, String name, String email, String phone, String cpf) {
        this.id = id;
        this.endereco = endereco;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;

        addPerfil(Perfil.CLIENTE);
    }
}
