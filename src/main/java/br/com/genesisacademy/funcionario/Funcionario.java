package br.com.genesisacademy.funcionario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
  
  @Id
  @GeneratedValue
  @Column(name = "fn_id")
  private Long id;

  @Column(name = "fn_nome")
  private String nome;

  @Column(name = "fn_cpf")
  private String cpf;

  @Column(name = "fn_cargo")
  private String cargo;

  @Column(name = "fn_departamento")
  private String departamento;



}
