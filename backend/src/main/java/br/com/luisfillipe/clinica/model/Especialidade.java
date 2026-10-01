package br.com.luisfillipe.clinica.model;
import jakarta.persistence.*; import jakarta.validation.constraints.NotBlank;
@Entity public class Especialidade {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
}
