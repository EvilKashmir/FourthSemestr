package ru.itis.services;


import ru.itis.dto.SignInForm;

public interface SignInService {
    boolean signIn(SignInForm signInForm);

}
