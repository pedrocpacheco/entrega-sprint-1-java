package br.com.genesisacademy.model.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.genesisacademy.model.aula.dtos.AulaCriadoDto;
import br.com.genesisacademy.model.aula.dtos.AulaEncontradoDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/aula")
public class AulaController {
 
  @Autowired
  private AulaService service;

  @PostMapping()
  public ResponseEntity<Aula> create(@Valid @RequestBody AulaCriadoDto dto) {
    return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
  }

  @GetMapping()
  public ResponseEntity<List<Aula>> findAll() {
    return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
  }

  @GetMapping("{id}")
  public ResponseEntity<AulaEncontradoDto> findById(@PathVariable Long id) {
    return new ResponseEntity<>(service.findById(id), HttpStatus.FOUND);
  }

}
