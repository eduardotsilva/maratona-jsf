/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Edu
 */
@Named
@SessionScoped
public class TesteSessionBean implements Serializable {

    private List<String> personagem = asList(" BATMAN", " LANTERNA", " AGUAMAN");
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
