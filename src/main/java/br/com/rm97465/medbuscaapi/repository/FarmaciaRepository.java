package br.com.rm97465.medbuscaapi.repository;

import br.com.rm97465.medbuscaapi.model.Farmacia;
import br.com.rm97465.medbuscaapi.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {

    @Query(value = "SELECT * FROM TB_MED_FARMACIA FAR " +
            "INNER JOIN TB_MEDICAMENTOS_FARMACIA MEDFAR " +
            "ON FAR.CD_FARMACIA = MEDFAR.CD_FARMACIA " +
            "INNER JOIN TB_MED_MEDICAMENTO MED " +
            "ON MEDFAR.CD_MEDICAMENTO = MED.CD_MEDICAMENTO WHERE MED.NM_MEDICAMENTO = :nomeMedicamento", nativeQuery = true)
    List<Farmacia> findFarmaciaByMedicamento(@Param("nomeMedicamento") String nomeMedicamento);
}
