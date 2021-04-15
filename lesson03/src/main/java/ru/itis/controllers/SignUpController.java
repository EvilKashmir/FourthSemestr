package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.dto.SignUpForm;
import ru.itis.services.SignUpService;
import ru.itis.services.SignUpServiceImpl;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up_page";
    }

    @PostMapping("/signUp")
    public String signUp(SignUpForm signUpForm) {
        if (signUpService.signUp(signUpForm))
            return "redirect:/main";
        return "sign_up_page";
    }
}
