package br.com.genesisacademy.model.trilha;

import java.util.List;

import br.com.genesisacademy.model.curso.Curso;
import br.com.genesisacademy.model.empresa.Empresa;
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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "em_id")
  private Empresa empresa;

  @OneToMany(mappedBy = "trilha", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Curso> cursos;



}
