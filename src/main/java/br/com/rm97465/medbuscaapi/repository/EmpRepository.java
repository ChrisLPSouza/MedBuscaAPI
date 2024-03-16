package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
}
