package br.com.genesisacademy.model.aula.dtos;

public record AulaEncontradoDto(
  Long id,
  String nome,
  String descricao,
  String conteudo,
  Long tempo_total){

  }