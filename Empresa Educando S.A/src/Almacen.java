public class Almacen {
    String codigoProducto;

    public Almacen(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "codigoProducto='" + codigoProducto + '\'' +
                '}';
    }
}
