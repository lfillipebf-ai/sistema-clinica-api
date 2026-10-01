package br.com.luisfillipe.clinica.repository;
import br.com.luisfillipe.clinica.model.Medico; import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicoRepository extends JpaRepository<Medico,Long>{}
