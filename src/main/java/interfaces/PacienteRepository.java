package interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

	List<Paciente> findAll();

	Paciente save(Paciente paciente);

	void deleteById(Long id);

	Optional<Paciente> findById(Long id);
}
