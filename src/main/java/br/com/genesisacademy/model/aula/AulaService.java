package br.com.genesisacademy.model.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.genesisacademy.exception.InformacaoExistenteException;
import br.com.genesisacademy.model.aula.dtos.AulaCriadoDto;
import br.com.genesisacademy.model.aula.dtos.AulaEncontradoDto;

@Service
public class AulaService {
 
  @Autowired
  private AulaRepository repository;

  public Aula create(AulaCriadoDto dto) {
    if (repository.findByConteudo(dto.conteudo()) != null)
      throw new InformacaoExistenteException("Aula com conteudo ja existente");

    var aula = new Aula(null, dto.nome(), dto.descricao(), dto.conteudo(), dto.tempoTotal(), null);
    return repository.save(aula);
  }

  public List<Aula> findAll(){
    return repository.findAll();
  }

  public AulaEncontradoDto findById(Long id) {
    var entity = repository.findById(id).get();
    var dto = new AulaEncontradoDto(entity.getId(), entity.getNome(), entity.getDescricao(), entity.getConteudo(), entity.getTempoTotal());
    return dto;
  }

}
