package edu.unam.ecomarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageProductsController {

    public ManageProductsController() { 

    }

    @RequestMapping("/manageProducts")
    public String gestionarProductos() {
        return "manageProducts";
    }
}
