/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.comunicacao;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import javax.faces.view.ViewScoped;

import javax.inject.Named;


/**
 *
 * @author Edu
 */
@Named
@ViewScoped
public class ComunicacaoResultadoTesteBean implements Serializable {
    
    private String nome;
    private String sobrenome;

    public void init() {
        System.out.println("Criou ComunicacaoResultado ");
        System.out.println(nome);
        System.out.println(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
