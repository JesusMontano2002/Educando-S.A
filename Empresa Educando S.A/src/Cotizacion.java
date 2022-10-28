import java.util.Date;

public class Cotizacion {
    String nombreProducto;
    int numeroContractual;
    int cantidad;
    Date fechaOrden;
    Double total;
    Date fechaEntrega;

    public Cotizacion(String nombreProducto, int numeroContractual, int cantidad, Date fechaOrden, Double total, Date fechaEntrega) {
        this.nombreProducto = nombreProducto;
        this.numeroContractual = numeroContractual;
        this.cantidad = cantidad;
        this.fechaOrden = fechaOrden;
        this.total = total;
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNumeroContractual() {
        return numeroContractual;
    }

    public void setNumeroContractual(int numeroContractual) {
        this.numeroContractual = numeroContractual;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", numeroContractual=" + numeroContractual +
                ", cantidad=" + cantidad +
                ", fechaOrden=" + fechaOrden +
                ", total=" + total +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
