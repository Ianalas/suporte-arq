package com.aula.project.suporte.dominio;


import com.aula.project.suporte.dominio.enumeracao.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

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



    public Cliente() {
        super();
        addPerfil(Perfil.CLIENTE);
    }
}
