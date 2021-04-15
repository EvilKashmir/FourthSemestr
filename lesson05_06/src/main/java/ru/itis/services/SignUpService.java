package ru.itis.services;

import ru.itis.dto.SignUpForm;

import javax.servlet.http.HttpSession;

public interface SignUpService {
    void signUp(SignUpForm form, HttpSession session);
}
