package br.com.projeto;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import entidades.Paciente;
import services.PacienteService;

@ManagedBean
public class PacienteBean {
    @Autowired
    private PacienteService pacienteService;
    private Paciente paciente = new Paciente();
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void save() {
        pacienteService.save(paciente);
    }
}
