package edu.unam.ecomarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientMenuController {

    public ClientMenuController() {

    }

    @RequestMapping("/clientMenu")
    public String menuCliente() {
        return "clientMenu";
    }
}
