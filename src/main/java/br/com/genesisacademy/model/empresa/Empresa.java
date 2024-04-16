package br.com.genesisacademy.model.empresa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPRESA")
public class Empresa {
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "em_id")
  private Long id;

  @Column(name = "em_cnpj")
  private String cnpj;

  @Column(name = "em_nome")
  private String nome;

  @Column(name = "em_descricao")
  private String descricao;


}
