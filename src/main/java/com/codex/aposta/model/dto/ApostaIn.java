package com.codex.aposta.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ApostaIn {
    @NotNull
    private Long idApostador;
}
