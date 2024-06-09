package br.com.rm97465.medbuscaapi.webservice.services;

import br.com.rm97465.medbuscaapi.model.Medicamento;
import br.com.rm97465.medbuscaapi.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private final MedicamentoRepository medicamentoRepository;

    public MedicamentoService(MedicamentoRepository medicamentoRepository) {
        this.medicamentoRepository = medicamentoRepository;

    }

    @Transactional
    public Medicamento cadastraMedicamento(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    @Transactional
    public List<Medicamento> listMedicamento() {
        return medicamentoRepository.findAll();
    }
}
