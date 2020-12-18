/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Edu
 */
@Named
@RequestScoped
/*
 RequestScoped é um escopo que vive durante a requisição HTTP
quando der a resposta, tudo da classe deixa de existir
Observe a personagemSelecionado veja que a lista não cresce ao clicar
no botão selecionar personagem, pois cada click e uma requisição.
*/
public class TesteRequestBean implements Serializable {

    private List<String> personagem = asList(" Homem-de-Ferro", " Thor", " Homem-Aranha");
    private List<String> personagemSelecionado = new ArrayList<>();

    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);

        String personagem = this.personagem.get(index);
        personagemSelecionado.add(personagem);

    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
