package br.com.genesisacademy.model.aula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long>{

  String findByConteudo(String conteudo);
  
}
