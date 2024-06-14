package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidades.Paciente;
import interfaces.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;
    
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
    
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
    
    public Paciente update(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
    
    public void delete(Long id) {
        pacienteRepository.deleteById(id);
    }
}
