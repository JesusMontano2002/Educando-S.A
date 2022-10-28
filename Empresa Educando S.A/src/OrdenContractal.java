import java.util.Date;

public class OrdenContractal {
    int numeroOrden;
    String CI;
    String nombreProveedor;
    Date fechaOrden;
    Double montoTotal;
    Date fechaEntrega;
    String proveedorElegido;

    public OrdenContractal(int numeroOrden, String CI, String nombreProveedor, Date fechaOrden, Double montoTotal, Date fechaEntrega, String proveedorElegido) {
        this.numeroOrden = numeroOrden;
        this.CI = CI;
        this.nombreProveedor = nombreProveedor;
        this.fechaOrden = fechaOrden;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.proveedorElegido = proveedorElegido;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getProveedorElegido() {
        return proveedorElegido;
    }

    public void setProveedorElegido(String proveedorElegido) {
        this.proveedorElegido = proveedorElegido;
    }

    @Override
    public String toString() {
        return "OrdenContractal{" +
                "numeroOrden=" + numeroOrden +
                ", CI='" + CI + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", fechaOrden=" + fechaOrden +
                ", montoTotal=" + montoTotal +
                ", fechaEntrega=" + fechaEntrega +
                ", proveedorElegido='" + proveedorElegido + '\'' +
                '}';
    }
}
