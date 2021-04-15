package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.dto.SignInForm;
import ru.itis.services.SignInService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SignInController {

    private final SignInService signInService;

    @Autowired
    public SignInController(SignInService signInService) {
        this.signInService = signInService;
    }

    @GetMapping("/signIn")
    public String signInPage() { return "sign_in"; }

    @PostMapping("/signIn")
    public String signIn(SignInForm form, HttpServletRequest request) {
        if (signInService.authenticate(form)) {
            request.getSession().setAttribute("authenticated", true);
            return "redirect:/";
        }
        return "redirect:/signIn";
    }
}
