/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.flowbuilder;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author Edu
 */
@Named
@FlowScoped(value = "newregistration")
public class TesteFlowBuilderBean implements Serializable {

    private String nome;
    private String sobreNome;
    private String endereco;

    public String salvar() {
        System.out.println("Salvando no banco...");
        return "exitToNewInicio";
    }

    public void salvarFinalizer() {
        System.out.println("Salvando no banco...");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
