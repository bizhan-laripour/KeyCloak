package net.dpco.keycloak.service;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class KeyCloakService {

    @Autowired
    private HttpServletRequest httpServletRequest;

    public String configCommonAttributes() {
        return   getKeycloakSecurityContext().getIdToken().getGivenName();
    }

    private KeycloakSecurityContext getKeycloakSecurityContext() {
        return (KeycloakSecurityContext) httpServletRequest.getAttribute(KeycloakSecurityContext.class.getName());
    }
}
