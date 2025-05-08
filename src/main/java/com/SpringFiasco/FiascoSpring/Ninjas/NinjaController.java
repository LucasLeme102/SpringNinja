package com.SpringFiasco.FiascoSpring.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ola")
    public String olaController (){
        return "retorno do olá controller";
    }
}
