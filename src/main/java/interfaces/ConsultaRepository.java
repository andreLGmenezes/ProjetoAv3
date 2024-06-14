package interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Consulta;


public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

	List<Consulta> findAll();

	Consulta save(Consulta consulta);

	void deleteById(Long id);
}
