package www.spring.com.prueba7.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Persona {

    @NotBlank(message = "Este campo no puede ir vacio")
    private String nombre;

    @NotNull(message = "Este campo no puede ir vacio")
    private Integer edad;

    @NotBlank(message = "Este campo no puede ir vacio")
    private String sexo;

    @NotBlank(message = "Este campo no puede ir vacio")
    private String ocupacion;

    @NotNull(message = "Este campo no puede ir vacio")
    private Integer tablaInicial;

    @NotNull(message = "Este campo no puede ir vacio")
    private Integer tablaFinal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getTablaInicial() {
        return tablaInicial;
    }

    public void setTablaInicial(Integer tablaInicial) {
        this.tablaInicial = tablaInicial;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getTablaFinal() {
        return tablaFinal;
    }

    public void setTablaFinal(Integer tablaFinal) {
        this.tablaFinal = tablaFinal;
    }
}
