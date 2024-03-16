package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//<Entity, ID>
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
