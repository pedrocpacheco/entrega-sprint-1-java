package br.com.genesisacademy.model.curso;

import java.util.List;

import br.com.genesisacademy.model.aula.Aula;
import br.com.genesisacademy.model.trilha.Trilha;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "CURSO")
public class Curso {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cr_id")
  private Long id;

  @Column(name = "cr_nome")
  private String nome;

  @Column(name = "cr_descricao")
  private String descricao;

  @Column(name = "cr_tempo_total")
  private Long tempoTotal;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "te_id")
  private Trilha trilha;

  @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Aula> aulas;

}
