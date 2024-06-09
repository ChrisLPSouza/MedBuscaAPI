package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {
}
