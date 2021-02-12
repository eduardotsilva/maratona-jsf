/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowbuilder;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;


/**
 *
 * @author Edu
 */
public class NewRegistrationFlowBuilder implements Serializable {

    @Produces 
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newregistration";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/newregistration/newregistration.xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId, "/newregistration/newregistration2.xhtml");
        flowBuilder.viewNode(flowId, "/newregistration/newregistration3.xhtml");
        
        flowBuilder.switchNode("newregistrationPage2")
                .defaultOutcome(flowId)
                .switchCase()
                .condition("#{not empty testeFlowBuilderBean.nome and not empty testeFlowBuilderBean.sobreNome}")
                .fromOutcome("newregistration2");
        
        flowBuilder.flowCallNode("callnewpendencies")
                .flowReference("","newpendencies")
                .outboundParameter("userName", "#{testeFlowBuilderBean.nome}")
                .outboundParameter("userSurname", "#{testeFlowBuilderBean.sobreNome}");
        
        flowBuilder.returnNode("exitToInicio").fromOutcome("/inicioflow.xhtml");
        flowBuilder.returnNode("exitToIndex").fromOutcome("/index.xhtml");
        flowBuilder.finalizer("#{testeFlowBuilderBean.salvar}");
        
                
        return flowBuilder.getFlow();
    }

}
