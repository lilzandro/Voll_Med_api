package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {

    private String calle;
    private String numero;
    private String distrito;
    private String ciudad;
    private String complemento;

    public Direccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.ciudad = direccion.ciudad();
        this.complemento = direccion.complemento();
        this.distrito = direccion.distrito();
        this.numero = direccion.numero();
    }

    public Direccion actualizarDatos(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.ciudad = direccion.ciudad();
        this.complemento = direccion.complemento();
        this.distrito = direccion.distrito();
        this.numero = direccion.numero();
        return this;
    }

    public void actualizarDireccion(DatosDireccion direccion) {
    }

}
