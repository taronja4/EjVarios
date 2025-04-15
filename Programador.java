import java.time.LocalDate;

public class Programador {
    private String nombre;
    private double salario;
    private LocalDate fechaInicio;


    public Programador(String nombre, double salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }


    public Programador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
