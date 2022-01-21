package com.example.validationinputform;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/results").setViewName("results");
  }
//  The showForm method returns the form template. It includes a PersonForm in its method signature
//  so that the template can associate form attributes with a PersonForm.
  @GetMapping("/")
  public String showForm(PersonForm personForm) {
    return "form";
  }

//  The checkPersonInfo method accepts two arguments:
//  A personForm object marked with @Valid to gather the attributes filled out in the form.
//  A bindingResult object so that you can test for and retrieve validation errors.
//  Um objeto bindingResult para que você possa testar e recuperar erros de validação.
  @PostMapping("/")
  public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "form";
    }

    return "redirect:/results";
  }

}
