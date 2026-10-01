package br.com.luisfillipe.clinica.controller;
import br.com.luisfillipe.clinica.model.Paciente; import br.com.luisfillipe.clinica.repository.PacienteRepository; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/pacientes") public class PacienteController{
 private final PacienteRepository r; public PacienteController(PacienteRepository r){this.r=r;}
 @GetMapping public List<Paciente> listar(){return r.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Paciente criar(@Valid @RequestBody Paciente p){return r.save(p);}
}
