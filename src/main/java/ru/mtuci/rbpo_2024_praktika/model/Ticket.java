package ru.mtuci.rbpo_2024_praktika.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    private Date currentDate;         // Текущая дата сервера
    private Long ticketLifetime;      // Время жизни тикета (в миллисекундах)
    private Date licenseActivationDate; // Дата активации лицензии
    private Date licenseExpirationDate; // Дата истечения лицензии
    private Long userId;              // Идентификатор пользователя
    private Long deviceId;            // Идентификатор устройства
    private Boolean licenseBlocked;    // Флаг блокировки лицензии
    private String digitalSignature;   // Цифровая подпись
}

