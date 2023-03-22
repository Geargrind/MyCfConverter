package com.example.mycfconverter.Controller;

import Model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/result")
    public String calculateCelcius(@ModelAttribute Calculator calculator, Model model){
        model.addAttribute("calc", calculator);
        calculator.setAnswer((calculator.getFahrenheit() - 32) * 0.55);

        return "result";
    }
}


