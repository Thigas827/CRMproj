package com.CRMgp9.CRM.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "usuario")
public class Usuario {
   @Id()
   @GeneratedValue
   private UUID codigo_usuario;
   @Column(name = "nome")
   private String nome;
   @Column(name = "email")
   private String email;
   @Column(name = "senha")
   private String senha;
   @Column(name = "cargo") 
   // Gerente, Vendedor, Atendente
   private String cargo;
   @Column(name = "permissao")
   private String permissao; // Administrador, Usuario

// Constructor
   public Usuario(UUID codigo_usuario, String nome, String email, String senha, String cargo, String permissao) {
      this.codigo_usuario = codigo_usuario;
      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.cargo = cargo;
      this.permissao = permissao;
   }
    // Construtor vazio
   public Usuario() {
   }
//getters e Setters
   public UUID getCodigo_usuario() {
   return codigo_usuario;
   }
   public void setCodigo_usuario(UUID codigo_usuario) {
   this.codigo_usuario = codigo_usuario;
   }
   public String getNome() {
   return nome;
   }
   public void setNome(String nome) {
   this.nome = nome;
   }
   public String getEmail() {
   return email;
   }
   public void setEmail(String email) {
   this.email = email;
   }
   public String getSenha() {
   return senha;
   }
   public void setSenha(String senha) {
   this.senha = senha;
   }
   public String getCargo() {
   return cargo;
   }
   public void setCargo(String cargo) {
   this.cargo = cargo;
   }
   public String getPermissao() {
   return permissao;
   }
   public void setPermissao(String permissao) {
   this.permissao = permissao;
   }

}
