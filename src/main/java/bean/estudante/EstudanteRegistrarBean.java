package bean.estudante;

import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import model.Estudante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edu
 */
@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "Eduardo", "Aparecido"};
    private List<String> nomeList = asList("Eduardo", "Gaby", "Cirlene");
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNota;
    private boolean mostrarLink;

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public void exibirNotas() {
        this.mostrarNota = true;
    }

    public void esconderNotas() {
        this.mostrarNota = false;
    }

    public void exibirLink() {
        this.mostrarLink = true;
    }

    public void esconderLink() {
        this.mostrarLink = false;
    }

    public boolean isMostrarNota() {
        return mostrarNota;
    }

    public void setMostrarNota(boolean mostrarNota) {
        this.mostrarNota = mostrarNota;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    {
        nomesMap.put("Goku", "O Mais Forte");
        nomesMap.put("One Piece", "Mais longo");
        nomesMap.put("Naruto", "Mais chato");

        //imprimindo um Map
        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }
    }

    public void executar() {
//        System.out.println("Fazendo busca no BD");
//        System.out.println("Processando os dados");
//        System.out.println("Exibindo os dados");
    }

    public void executar(String teste) {
//        System.out.println("Com parâmetro" + teste);
//        System.out.println("Fazendo busca no BD");
//        System.out.println("Processando os dados");
//        System.out.println("Exibindo os dados");
    }

    public String executarRetorno() {
        return "EU ESTOU APRENDENDO JSF";
    }

    public String irParaIndex2() {
        System.out.println("Entrei em Ir para Index 2");
        return "index2?faces-redirect=true";
    }

    public List<String> getNomeList() {
        return nomeList;
    }

    public void setNomeList(List<String> nomeList) {
        this.nomeList = nomeList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

}
