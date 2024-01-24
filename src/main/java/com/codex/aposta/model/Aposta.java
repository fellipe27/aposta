package com.codex.aposta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Aposta {
    @Id @NotBlank
    private String numeroAposta;
    @ManyToOne
    @JoinColumn(name = "idApostador", nullable = false)
    private Apostador apostador;
}
