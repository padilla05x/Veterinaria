package co.edu.uniquindio.veterinaria.model;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@Builder

public class Veterinario {
    private String nombre;
    private EspecialidadVet especialidad;
    private String numeroLicencia;
}
