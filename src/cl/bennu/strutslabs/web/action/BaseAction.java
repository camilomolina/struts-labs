package cl.bennu.strutslabs.web.action;

import cl.bennu.strutslabs.commons.dto.base.ContextDTO;
import org.apache.struts.action.ActionForward;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;

public class BaseAction extends DispatchAction {

    public static final ActionForward NULL = null;

    public ContextDTO buildContext(HttpServletRequest request) {
        ContextDTO  contextDTO = new ContextDTO();
        contextDTO.setUser("ADMIN");
        contextDTO.setHost(request.getRemoteHost());

        return contextDTO;
    }
}
