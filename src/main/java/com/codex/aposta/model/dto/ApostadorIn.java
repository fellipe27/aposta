package com.codex.aposta.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class ApostadorIn {
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
}
