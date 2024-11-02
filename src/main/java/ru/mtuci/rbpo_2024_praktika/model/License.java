package ru.mtuci.rbpo_2024_praktika.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "licenses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "type_id")
    private Long typeId;

    @Column(name = "first_activation_date")
    private Date firstActivationDate;

    @Column(name = "ending_date")
    private Date endingDate;

    @Column(name = "blocked")
    private Boolean blocked;

    @Column(name = "device_count")
    private Integer deviceCount;

    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "description")
    private String description;
}
