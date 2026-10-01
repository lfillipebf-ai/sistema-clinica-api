package br.com.luisfillipe.clinica.repository;
import br.com.luisfillipe.clinica.model.Consulta; import org.springframework.data.jpa.repository.JpaRepository; import java.time.LocalDateTime; import java.util.List;
public interface ConsultaRepository extends JpaRepository<Consulta,Long>{ List<Consulta> findByDataHoraBetween(LocalDateTime inicio,LocalDateTime fim); }
