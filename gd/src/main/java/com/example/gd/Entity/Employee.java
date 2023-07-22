package com.example.gd.Entity;

import com.example.gd.Entity.Enum.TypeContract;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name")
    @NotBlank
    private String name;

    @Column(nullable = false, name = "email")
    @NotBlank
    private String email;

    @Column(nullable = false, name = "date_of_recruitment")
    @NotBlank
    private LocalDate dateOfRecruitment;

    @Column(nullable = false, name = "contract_expiration")
    private LocalDate contractExpiration;

    @Column(nullable = false, name = "number")
    @NotBlank
    private String number;

    @Column(nullable = false, name = "type_gender")
    @Enumerated(EnumType.STRING)
    private TypeContract typeContract;

    @Column(nullable = false, name = "birthday")
    @NotBlank
    private LocalDate birthday;
}
