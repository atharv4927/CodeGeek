package com.codegeek.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class codegeekcontroller
{
		  @GetMapping("/home")
		  public String welcome()
		  {
			  return "index.html";
		  }
}

