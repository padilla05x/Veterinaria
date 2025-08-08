package co.edu.uniquindio.veterinaria.model;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@Builder

public class Propietario {
    private String nombre;
    private String iD;
    private String telefono;
    private String direccion;
}
