package edu.unam.ecomarket.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@Getter @Setter @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    @SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_sequence", allocationSize = 1)
    private Long idUsuario;
    
    @Column(nullable = false)
    @Setter(AccessLevel.NONE)
    @NotBlank
    private String nombre;

    @Column(nullable = false)
    @Setter(AccessLevel.NONE)
    @NotBlank
    private String contrasena;

    @Column(nullable = false)
    @Setter(AccessLevel.NONE)
    @NotBlank
    private String email;

    public Usuario(String nombre, String contrasena, String email) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
    }
}
