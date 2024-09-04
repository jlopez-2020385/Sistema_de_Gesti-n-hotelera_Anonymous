package com.luislopez.Anonymous.DTOs;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRegisterDTO implements Serializable {
private String Id;
@NotBlank(message = "El correo es obligatorio")
@Email(message = "Ingresa una direccion de correo Valida")
private String email;
}
