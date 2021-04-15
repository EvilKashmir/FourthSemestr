package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.dto.SignUpForm;
import ru.itis.models.User;
import ru.itis.repositories.UserRepository;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Service
public class SignUpServiceImpl implements SignUpService {

    private final UserRepository usersRepository;

    private final PasswordEncoder encoder;

    @Autowired
    public SignUpServiceImpl(UserRepository userRepository, PasswordEncoder encoder) {
        this.usersRepository = userRepository;
        this.encoder = encoder;
    }

    @Override
    public void signUp(SignUpForm form, HttpSession session) {
        User newUser = User.builder()
                .name(form.getFirstname())
                .lastname(form.getLastname())
                .email(form.getEmail())
                .passwordHash(encoder.encode(form.getPassword()))
                .build();

        if (usersRepository.save(newUser)) {
            session.setAttribute("authenticated", true);
        }
    }

}
