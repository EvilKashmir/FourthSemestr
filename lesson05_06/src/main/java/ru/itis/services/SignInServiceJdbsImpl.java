package ru.itis.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.dto.SignInForm;
import ru.itis.models.User;
import ru.itis.repositories.UserRepository;

import java.util.Optional;

@Service
public class SignInServiceJdbsImpl implements SignInService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SignInServiceJdbsImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean authenticate(SignInForm form) {
        Optional<User> userOptional = userRepository.findByEmail(form.getEmail());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            System.out.println(form.getPassword());
            return passwordEncoder.matches(form.getPassword(), user.getPasswordHash());
        }
        return false;
    }
}
