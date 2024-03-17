package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> { }
