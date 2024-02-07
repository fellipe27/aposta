package com.codex.aposta.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApostadorIn {
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
}
