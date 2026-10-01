package br.com.luisfillipe.clinica.repository;
import br.com.luisfillipe.clinica.model.Paciente; import org.springframework.data.jpa.repository.JpaRepository;
public interface PacienteRepository extends JpaRepository<Paciente,Long>{}
