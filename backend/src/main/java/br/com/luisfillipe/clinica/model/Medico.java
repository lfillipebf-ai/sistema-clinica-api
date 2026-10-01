package br.com.luisfillipe.clinica.model;
import jakarta.persistence.*; import jakarta.validation.constraints.NotBlank;
@Entity public class Medico {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome; @NotBlank private String crm;
 @ManyToOne(optional=false) private Especialidade especialidade;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public String getCrm(){return crm;} public void setCrm(String v){crm=v;}
 public Especialidade getEspecialidade(){return especialidade;} public void setEspecialidade(Especialidade v){especialidade=v;}
}
