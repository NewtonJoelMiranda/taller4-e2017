package py.edu.facitec.ejemplo2017.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {

        System.out.println("Cargando la pagina");
        return "/view/templates/index";
    }
}
