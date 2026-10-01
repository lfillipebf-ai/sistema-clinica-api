package br.com.luisfillipe.clinica.controller;
import br.com.luisfillipe.clinica.model.Especialidade; import br.com.luisfillipe.clinica.repository.EspecialidadeRepository; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/especialidades") public class EspecialidadeController{
 private final EspecialidadeRepository r; public EspecialidadeController(EspecialidadeRepository r){this.r=r;}
 @GetMapping public List<Especialidade> listar(){return r.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Especialidade criar(@Valid @RequestBody Especialidade e){return r.save(e);}
}
