package co.edu.uniquindio.veterinaria.model;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@Builder

public class Mascota {
    private Propietario propietario;
    private String nombre;
    private Especie especie;
    private String raza;
    private int edad;
    private String iDVeterinaria;

    @Override
    public String toString() {
        return iDVeterinaria+" - "+nombre;
    }
}
