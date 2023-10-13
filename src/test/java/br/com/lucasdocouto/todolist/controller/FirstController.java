package br.com.lucasdocouto.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeirarota")

public class FirstController {

    @GetMapping("/")
    public String primeiraMensagem(){
        return "It works";
    }
}
