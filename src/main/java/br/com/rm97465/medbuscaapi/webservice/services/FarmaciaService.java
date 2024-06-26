package br.com.rm97465.medbuscaapi.webservice.services;

import br.com.rm97465.medbuscaapi.model.Farmacia;
import br.com.rm97465.medbuscaapi.model.Medicamento;
import br.com.rm97465.medbuscaapi.model.Receita;
import br.com.rm97465.medbuscaapi.repository.FarmaciaRepository;
import br.com.rm97465.medbuscaapi.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FarmaciaService {

    @Autowired
    private final FarmaciaRepository farmaciaRepository;

    public FarmaciaService(FarmaciaRepository farmaciaRepository) {
        this.farmaciaRepository = farmaciaRepository;

    }

    @Transactional
    public Farmacia cadastraFarmacia(Farmacia farmacia) {
        return farmaciaRepository.save(farmacia);
    }

    @Transactional
    public List<Farmacia> listFarmacia() {
        return farmaciaRepository.findAll();
    }

    @Transactional
    public List<Farmacia> listFarmaciaByMedicamento(String nomeMedicamento) {
        return farmaciaRepository.findFarmaciaByMedicamento(nomeMedicamento);
    }

    @Transactional
    public List<Farmacia> cadastraListaFarmacias(List<Farmacia> farmaciasLista) {
        return farmaciaRepository.saveAll(farmaciasLista);
    }
}
