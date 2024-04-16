package br.com.genesisacademy.model.aula.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AulaCriadoDto(
    @NotBlank(message = "O nome não pode ser nulo.") String nome,
    @NotBlank(message = "A descrição não pode ser nula.") String descricao,
    @NotBlank(message = "O conteúdo não pode ser nulo.") String conteudo,
    @NotNull(message = "O tempo total não pode ser nulo.") Long tempoTotal) {
}

