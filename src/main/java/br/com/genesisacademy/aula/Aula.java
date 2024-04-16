package br.com.genesisacademy.aula;

import br.com.genesisacademy.curso.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "AULA")
public class Aula {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "au_id")
  private Long id;

  @Column(name = "au_nome")
  private String nome;

  @Column(name = "au_descricao")
  private String descricao;

  @Column(name = "au_conteudo")
  private String conteudo;

  @Column(name = "au_tempo_total")
  private Long tempoTotal;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idCurso")
  private Curso curso;
  
}
