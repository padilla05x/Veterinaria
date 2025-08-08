package co.edu.uniquindio.veterinaria.model;
import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@Setter
@Builder

public class ConsultaMedica {
    private LocalDateTime fecha;
    private Mascota mascotaAtendida;
    private Veterinario veterinarioAsignado;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamientoAplicado;

}
