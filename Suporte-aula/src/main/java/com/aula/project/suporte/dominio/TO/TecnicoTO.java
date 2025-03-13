package com.aula.project.suporte.dominio.TO;

import com.aula.project.suporte.dominio.Tecnico;
import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.annotation.Nonnull;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TecnicoTO {
    protected Integer id;

    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    protected Set<Perfil> perfil = new HashSet<>();

    public TecnicoTO(Integer id, String nome, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public TecnicoTO(Tecnico obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getName();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();

//        this.perfil = obj.getPerfil().stream()
//                .map(x -> x.getCodigo()).collect(Collectors.toSet());
//
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        addPerfil(perfil.)
    }
}
