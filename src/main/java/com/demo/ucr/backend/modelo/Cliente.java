package com.demo.ucr.backend.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter @Setter
    @NotEmpty
    @NotNull
    private String nombre;

    @NotEmpty
    @NotNull
    @Getter @Setter
    @Email(message = "${validatedValue} no es un email valido")
    private String email;

    @Getter @Setter
    private BigDecimal sueldo;

    @Getter @Setter
    @Past
    private LocalDate fechaNacimiento;

    @NotNull
    @Size(min = 6, max = 20, message =  "Debe tener entre {min} y {max} caracteres de largo")
    private String clave;

}
