public class Item {
    String nombre;
    int cantidadSolicitada;
    Double unidadMedida;
    Double valorUnitario;
    Double valorIoial;

    public Item(String nombre, int cantidadSolicitada, Double unidadMedida, Double valorUnitario, Double valorIoial) {
        this.nombre = nombre;
        this.cantidadSolicitada = cantidadSolicitada;
        this.unidadMedida = unidadMedida;
        this.valorUnitario = valorUnitario;
        this.valorIoial = valorIoial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public Double getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Double unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorIoial() {
        return valorIoial;
    }

    public void setValorIoial(Double valorIoial) {
        this.valorIoial = valorIoial;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSolicitada=" + cantidadSolicitada +
                ", unidadMedida=" + unidadMedida +
                ", valorUnitario=" + valorUnitario +
                ", valorIoial=" + valorIoial +
                '}';
    }
}
