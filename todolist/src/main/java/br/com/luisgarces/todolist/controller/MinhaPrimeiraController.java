package br.com.luisgarces.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota

public class MinhaPrimeiraController {
	@GetMapping("/")
	public String pimeiraMensagem() {
		return "Funcionou";
		
	}

}
