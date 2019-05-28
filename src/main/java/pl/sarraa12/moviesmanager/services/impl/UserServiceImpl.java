package pl.sarraa12.moviesmanager.services.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sarraa12.moviesmanager.domain.repositories.UserRepository;
import pl.sarraa12.moviesmanager.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean isUsernameFree(String username) {
        return userRepository.isUsernameFree(username);
    }

//    @Override
//    public void registerUser(RegistrationFormDTO registrationForm) {
//        User userToRegister = ConverterFactory.converterUser(registrationForm);
//        userToRegister.setPassword(passwordEncoder.encode(userToRegister.getPassword()));
//        userRepository.save(userToRegister);
//    }
}
