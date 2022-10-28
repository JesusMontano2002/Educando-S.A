import java.util.Date;

public class Solicitud {
    int numero;
    Date fecha;
    String nombre;
    String CI;

    public Solicitud(int numero, Date fecha, String nombre, String CI) {
        this.numero = numero;
        this.fecha = fecha;
        this.nombre = nombre;
        this.CI = CI;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "numero=" + numero +
                ", fecha=" + fecha +
                ", nombre='" + nombre + '\'' +
                ", CI='" + CI + '\'' +
                '}';
    }
}
