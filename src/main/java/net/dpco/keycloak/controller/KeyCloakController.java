package net.dpco.keycloak.controller;

import net.dpco.keycloak.entity.Member;
import net.dpco.keycloak.service.KeyCloakService;
import net.dpco.keycloak.service.MemberService;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class KeyCloakController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private KeyCloakService keyCloakService;

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public String getAll(ModelMap modelMap) {
        List<Member> members = memberService.getAll();
        modelMap.put("members", members);
        return "findAll";
    }

    @RequestMapping(path = "/username", method = RequestMethod.GET)
    public String username(ModelMap modelMap) {
        modelMap.put("username", keyCloakService.configCommonAttributes());
        return "username";
    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        return "index";
    }


}
