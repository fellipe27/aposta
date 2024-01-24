package com.codex.aposta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import static jakarta.persistence.GenerationType.AUTO;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Apostador {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank @Email
    private String email;
}
