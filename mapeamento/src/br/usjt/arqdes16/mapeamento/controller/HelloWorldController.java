package br.usjt.arqdes16.mapeamento.controller; 

 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping; 
 
 //apenas um comentário de teste
 
 @Controller 
 public class HelloWorldController { 
   @RequestMapping("/hello")
   public String execute(){ 
	   System. out .println("chamou o controller hello");
	   return "hello"; 
	   } 
   }	
