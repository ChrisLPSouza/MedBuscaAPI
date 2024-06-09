package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {
}
