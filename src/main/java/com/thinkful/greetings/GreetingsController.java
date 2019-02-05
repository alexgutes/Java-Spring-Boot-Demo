package com.thinkful.greetings;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingsController {
  @RequestMapping("/")
  public String index() {
    return "Hola! Jambo! Ciao! Namaste! Salaam! Hello!";
  }
}