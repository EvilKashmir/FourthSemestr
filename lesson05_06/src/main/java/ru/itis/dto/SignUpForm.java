package ru.itis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.validation.ValidPassword;
import ru.itis.validation.ValidPasswords;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@ValidPasswords(
        message = "{errors.incorrect.passwordsMatch}",
        password = "password",
        passwordAgain = "passwordAgain"
)
public class SignUpForm {
    @NotNull
    @Size(min = 3, max = 15)
    private String firstname;
    @NotNull
    @Size(min = 3, max = 15)
    private String lastname;
    @Email(message = "{errors.incorrect.email}")
    private String email;
    @ValidPassword(message = "{errors.incorrect.password}")
    private String password;
    private String passwordAgain;
}
