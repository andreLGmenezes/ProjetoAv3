package interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.IMC;

public interface IMCRepository extends JpaRepository<IMC, Long> {

	List<IMC> findAll();

	IMC save(IMC imc);

	void deleteById(Long id);
}

