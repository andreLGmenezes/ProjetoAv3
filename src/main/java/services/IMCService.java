package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidades.IMC;
import entidades.Paciente;
import interfaces.IMCRepository;
import interfaces.PacienteRepository;

@Service
public class IMCService {
    @Autowired
    private IMCRepository imcRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    
    public List<IMC> findAll() {
        return imcRepository.findAll();
    }
    
    public IMC save(IMC imc) {
        Paciente paciente = pacienteRepository.findById(imc.getPaciente().getId()).orElseThrow();
        imc.setPaciente(paciente);
        imc.setResultado(calcularIMC(imc.getPeso(), imc.getAltura()));
        return imcRepository.save(imc);
    }
    
    public IMC update(IMC imc) {
        return imcRepository.save(imc);
    }
    
    public void delete(Long id) {
        imcRepository.deleteById(id);
    }
    
    private String calcularIMC(Double peso, Double altura) {
        Double imc = peso / Math.pow(altura, 2);
        if (imc < 16.9) {
            return "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.4) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Acima do peso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc <= 40) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}

