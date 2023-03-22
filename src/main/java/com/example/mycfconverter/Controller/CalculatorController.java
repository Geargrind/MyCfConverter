package com.example.mycfconverter.Controller;

import Model.Calculator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class CalculatorController {
    @PostMapping("/result")
    public double calculateCelcius(@ModelAttribute  Calculator calculator, Model model){
        model.addAttribute("Calc", calculator);
        double answer = (calculator.getFahrenheit() - 32) * 0.55;
        return answer;
    }
}
