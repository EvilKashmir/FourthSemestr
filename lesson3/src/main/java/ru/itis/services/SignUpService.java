package ru.itis.services;

import ru.itis.dto.SignUpForm;

public interface SignUpService {
    boolean signUp(SignUpForm signUpForm);
}
