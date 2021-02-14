/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.comunicacao;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.cdi.Param;

/**
 *
 * @author Edu
 */
@Named
@ViewScoped
public class ComunicacaoTeste2Bean implements Serializable {
    //utilizando omnifaces para injetar parametro passado pelo arquivo xhtml
    @Inject @Param(name = "nome")
    private String nome;
    @Inject @Param(name = "sobrenome")
    private String sobrenome;

    @PostConstruct
    public void init() {
//        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        System.out.println("Criou comunicacao2 ");
//        nome = paramsMap.get("nome");
//        sobrenome = paramsMap.get("sobrenome");
        
//        System.out.println(nome);
//        System.out.println(sobrenome);
//        System.out.println(paramsMap);
                

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
