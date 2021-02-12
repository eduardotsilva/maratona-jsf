/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.flowbuilder;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author Edu
 */
@Named
@FlowScoped(value = "newpendencies")
public class TesteFlowBuilderNestedBean implements Serializable {

    private String userName;
    private String userSurname;

    public String validarUser() {
        System.out.println("Fazendo consulta no SERASA");
        System.out.println("Fazendo consulta no SPC");

//        if (true) {
//            FacesContext context = FacesContext.getCurrentInstance();
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro Usuário não passou nas pendências!", "")
//            );
//            /* return null mantem na mesma pagina */
//            return null;
//        }
        return "proceedToNewRegistration3";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

}
