package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.dto.SignInForm;
import ru.itis.models.User;
import ru.itis.repository.UserRepository;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean signIn(SignInForm signInForm) {
        User user = User.builder()
                .email(signInForm.getEmail())
                .password(signInForm.getPassword())
                .build();
        System.out.println("228");
        Boolean isSignIn = userRepository.getUserByEmailPassword(user);
        return isSignIn != null && isSignIn;
    }
}
