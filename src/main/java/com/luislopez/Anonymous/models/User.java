package com.luislopez.Anonymous.models;

import jakarta.validation.constraints.Email;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "User")

public class User implements Serializable{
    @Id
    @Column(name = "Id")
    private String id;

    @Email(message="Ingresa una direccion Email Valida")
    @Column(unique = true)
    private String email;
}
