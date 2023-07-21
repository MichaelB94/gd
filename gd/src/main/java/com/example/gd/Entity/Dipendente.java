package com.example.gd.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dipendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    private String email;

    @Column
    @NotBlank
    private Date dataAssunzione;

    @Column
    private Date scadenzaContratto;

    @Column
    @NotBlank
    private String number;

    @Column
    @NotBlank
    private String tipologiaContratto;
}
