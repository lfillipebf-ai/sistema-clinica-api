package br.com.luisfillipe.clinica.controller;
import br.com.luisfillipe.clinica.model.Medico; import br.com.luisfillipe.clinica.repository.MedicoRepository; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/medicos") public class MedicoController{
 private final MedicoRepository r; public MedicoController(MedicoRepository r){this.r=r;}
 @GetMapping public List<Medico> listar(){return r.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Medico criar(@Valid @RequestBody Medico m){return r.save(m);}
}
