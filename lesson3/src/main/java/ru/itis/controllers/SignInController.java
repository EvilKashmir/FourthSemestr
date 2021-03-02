package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.dto.SignInForm;
import ru.itis.services.SignInService;

@Controller
public class SignInController {

    @Autowired
    private SignInService signInService;

    @GetMapping("/signIn")
    public String getSignInPage() {
        return "sign_in_page";
    }

    @PostMapping("/signIn")
    public String signIn(SignInForm signInForm) {
        if (signInService.signIn(signInForm))
            return "redirect:/main";
        return "sign_in_page";
    }
}
