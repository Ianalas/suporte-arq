package com.aula.project.suporte.dominio;

import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
public abstract class Pessoa {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "senha")
    private String senha;

    private Set<Perfil> perfil = new HashSet<>();

    public Set<Perfil> getPerfil() {
        return perfil;
    }

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
