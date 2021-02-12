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
public class NewPendenciesFlowBuilder implements Serializable {

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newpendencies";
        
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/newpendencies/newpendencies.xhtml").markAsStartNode();
        flowBuilder.returnNode("proceedToNewRegistration3")
                .fromOutcome("/newregistration/newregistration3.xhtml");
    
        flowBuilder.returnNode("exitToNewinicio")
                .fromOutcome("/newregistration/newregistration.xhtml");
        
        flowBuilder.inboundParameter("userName", "#{testeFlowBuilderNestedBean.userName}");
        flowBuilder.inboundParameter("userSurname", "#{testeFlowBuilderNestedBean.userSurname}");
        
        return flowBuilder.getFlow();
    }
}
