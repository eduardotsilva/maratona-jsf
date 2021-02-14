/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.comunicacao;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Edu
 */
@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {

    private String nome;
    private String sobrenome;

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

    public String save() {
        System.out.println(nome);
        System.out.println(sobrenome);
        
        return "comunicacao2?faces-redirect=true&nome=" +nome + "&sobrenome=" + sobrenome;
    }

    public void imprimirAtributos() {
        String InitParameter = FacesContext.getCurrentInstance()
                .getExternalContext()
                .getInitParameter("images.location");

    }

}
