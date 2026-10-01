package br.com.luisfillipe.clinica.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*;
@Entity public class Paciente {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String nome; @NotBlank private String telefone; @Email private String email;
 public Long getId(){return id;} public String getNome(){return nome;} public void setNome(String v){nome=v;}
 public String getTelefone(){return telefone;} public void setTelefone(String v){telefone=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
}
