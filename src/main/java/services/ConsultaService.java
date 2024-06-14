package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidades.Consulta;
import entidades.Paciente;
import interfaces.ConsultaRepository;
import interfaces.PacienteRepository;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    
    public List<Consulta> findAll() {
        return consultaRepository.findAll();
    }
    
    public Consulta save(Consulta consulta) {
        Paciente paciente = pacienteRepository.findById(consulta.getPaciente().getId()).orElseThrow();
        consulta.setPaciente(paciente);
        return consultaRepository.save(consulta);
    }
    
    public Consulta update(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
    
    public void delete(Long id) {
        consultaRepository.deleteById(id);
    }
}
