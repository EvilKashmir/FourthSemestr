package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.dto.SignUpForm;
import ru.itis.models.User;
import ru.itis.repository.UserRepository;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean signUp(SignUpForm signUpForm) {
        User user = User.builder()
                .email(signUpForm.getEmail())
                .password(signUpForm.getPassword())
                .build();
        return userRepository.save(user);
    }
}
