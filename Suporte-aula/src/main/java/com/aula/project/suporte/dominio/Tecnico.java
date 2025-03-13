package com.aula.project.suporte.dominio;

import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa{
    @OneToMany(mappedBy = "tecnico")
    private List<Chamados> chamados = new ArrayList<>();


    public Tecnico() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Tecnico(int id, String endereco, String name, String email, String phone, String cpf, List<Chamados> chamados) {
        super(id, endereco, name, email, phone, cpf);
        addPerfil(Perfil.CLIENTE);
    }

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }
}
