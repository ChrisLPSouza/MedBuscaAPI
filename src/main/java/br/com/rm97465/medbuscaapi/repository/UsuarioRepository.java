package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository chama uma instância do banco
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
