package controlador;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entidades.Paciente;
import services.PacienteService;

@RestController
public class PacienteControlador {
	@Autowired
	private PacienteService pacienteservice;
	
	@PostMapping
	public Paciente criarpaciente(@RequestBody Paciente paciente){
		return pacienteservice.save(paciente);
	}
	@GetMapping
	public List<Paciente> listarPacientes(){
		   return pacienteservice.findAll();
	}
	@PutMapping
	public Paciente atualizarpaciente(@RequestBody Paciente paciente) {
		return pacienteservice.update(paciente);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
	        pacienteservice.delete(id);
	}
}
