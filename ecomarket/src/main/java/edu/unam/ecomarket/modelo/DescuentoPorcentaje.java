package edu.unam.ecomarket.modelo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PORCENTAJE")
@NoArgsConstructor
public class DescuentoPorcentaje extends EstrategiaDescuento {

    public Double aplicarDescuento(Double precio) {
        return precio - (precio * (valorDescuento / 100));
    }
}
