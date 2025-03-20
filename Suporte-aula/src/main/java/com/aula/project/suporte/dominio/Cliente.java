package com.aula.project.suporte.dominio;


import com.aula.project.suporte.dominio.TO.ClienteTO;
import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class Cliente extends Pessoa{

    @OneToMany(mappedBy = "usuario_id")
    private List<Chamados> chamados = new ArrayList<>();

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }

    public Cliente(ClienteTO obj) {
        super();
        this.id = obj.getId();
        this.cpf = obj.getCpf();
        this.name = obj.getNome();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();

        this.perfil = obj.getPerfil().stream()
                .map(Perfil::toEnum).collect(Collectors.toSet());

        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(int id, String endereco, String name, String email, String phone, String cpf) {
        super(id, endereco, name, email, phone, cpf);
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente() {
        super();
    }
}
