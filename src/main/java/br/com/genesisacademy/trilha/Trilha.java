package br.com.genesisacademy.trilha;

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
@Table(name = "TRILHA_ESTUDO")
public class Trilha {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "te_id")
  private Long id;

  @Column(name = "te_nome")
  private String nome;

  @Column(name = "te_tempo_total")
  private Long tempoTotal;

  @Column(name = "te_descricao")
  private String descricao;

  

}
