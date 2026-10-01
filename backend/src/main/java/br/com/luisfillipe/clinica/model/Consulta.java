package br.com.luisfillipe.clinica.model;
import jakarta.persistence.*; import jakarta.validation.constraints.NotNull; import java.time.LocalDateTime;
@Entity public class Consulta {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Paciente paciente;
 @ManyToOne(optional=false) private Medico medico;
 @NotNull private LocalDateTime dataHora;
 @Enumerated(EnumType.STRING) private StatusConsulta status=StatusConsulta.AGENDADA;
 public Long getId(){return id;} public Paciente getPaciente(){return paciente;} public void setPaciente(Paciente v){paciente=v;}
 public Medico getMedico(){return medico;} public void setMedico(Medico v){medico=v;}
 public LocalDateTime getDataHora(){return dataHora;} public void setDataHora(LocalDateTime v){dataHora=v;}
 public StatusConsulta getStatus(){return status;} public void setStatus(StatusConsulta v){status=v;}
}
