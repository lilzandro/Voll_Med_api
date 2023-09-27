package med.voll.api.domain.medico;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String documento, String telefono, String email,
        DatosDireccion direccion) {

}
