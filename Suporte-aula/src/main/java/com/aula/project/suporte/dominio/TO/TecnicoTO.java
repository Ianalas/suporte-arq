package com.aula.project.suporte.dominio.TO;

import com.aula.project.suporte.dominio.Tecnico;
import com.aula.project.suporte.dominio.enumeracao.Perfil;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nonnull;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TecnicoTO {
    protected Integer id;

    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    protected Set<Integer> perfil = new HashSet<>();

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataCriacao = LocalDate.now();

    public TecnicoTO(Tecnico obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getName();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();

        this.perfil = obj.getPerfil().stream()
                .map(x -> x.getCodigo()).collect(Collectors.toSet());
        this.dataCriacao = obj.getDataCriacao();
    }

    public TecnicoTO() {
        super();
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

    public Set<Integer> getPerfil() {
        return perfil;
    }

    public void setPerfil(Set<Integer> perfil) {

        this.perfil = perfil;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
