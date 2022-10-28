public class Compras {
    String codigo;
    Factura factura;
    Distribuidor distribuidor;

    public Compras(String codigo, Factura factura, Distribuidor distribuidor) {
        this.codigo = codigo;
        this.factura = factura;
        this.distribuidor = distribuidor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "codigo='" + codigo + '\'' +
                ", factura=" + factura +
                ", distribuidor=" + distribuidor +
                '}';
    }
}
