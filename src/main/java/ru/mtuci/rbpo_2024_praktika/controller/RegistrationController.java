package ru.mtuci.rbpo_2024_praktika.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.rbpo_2024_praktika.repository.UserRepository; // Измените на правильный путь к вашему репозиторию
import ru.mtuci.rbpo_2024_praktika.model.ApplicationUser; // Измените на правильный путь к вашей модели

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class RegistrationController {

    private final UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody ApplicationUser newUser) {
        // Проверка, существует ли уже пользователь с таким именем
        if (userRepository.findByUsername(newUser.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Пользователь с таким именем уже существует");
        }

        // Сохранение нового пользователя
        userRepository.save(newUser);
        return ResponseEntity.ok("Пользователь успешно зарегистрирован");
    }
}

