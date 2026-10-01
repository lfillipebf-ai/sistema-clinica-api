package br.com.luisfillipe.clinica.controller;
import br.com.luisfillipe.clinica.model.*; import br.com.luisfillipe.clinica.repository.*; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.time.LocalDateTime; import java.util.List;
@RestController @RequestMapping("/api/consultas") public class ConsultaController{
 private final ConsultaRepository cr; private final PacienteRepository pr; private final MedicoRepository mr;
 public ConsultaController(ConsultaRepository cr,PacienteRepository pr,MedicoRepository mr){this.cr=cr;this.pr=pr;this.mr=mr;}
 @GetMapping public List<Consulta> listar(){return cr.findAll();}
 @GetMapping("/periodo") public List<Consulta> periodo(@RequestParam LocalDateTime inicio,@RequestParam LocalDateTime fim){return cr.findByDataHoraBetween(inicio,fim);}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Consulta criar(@Valid @RequestBody Consulta c){
  c.setPaciente(pr.findById(c.getPaciente().getId()).orElseThrow());
  c.setMedico(mr.findById(c.getMedico().getId()).orElseThrow());
  c.setStatus(StatusConsulta.AGENDADA); return cr.save(c);
 }
 @PatchMapping("/{id}/cancelar") public Consulta cancelar(@PathVariable Long id){Consulta c=cr.findById(id).orElseThrow();c.setStatus(StatusConsulta.CANCELADA);return cr.save(c);}
}
