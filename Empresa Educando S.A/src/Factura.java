import java.util.Date;

public class Factura {
    int numeroEntrada;
    Date fecha;
    int numeroFacturado;
    Proveedor proveedor;
    Double totalBienes;
    Double valorTotal;

    public Factura(int numeroEntrada, Date fecha, int numeroFacturado, Proveedor proveedor, Double totalBienes, Double valorTotal) {
        this.numeroEntrada = numeroEntrada;
        this.fecha = fecha;
        this.numeroFacturado = numeroFacturado;
        this.proveedor = proveedor;
        this.totalBienes = totalBienes;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroEntrada=" + numeroEntrada +
                ", fecha=" + fecha +
                ", numeroFacturado=" + numeroFacturado +
                ", proveedor=" + proveedor +
                ", totalBienes=" + totalBienes +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
