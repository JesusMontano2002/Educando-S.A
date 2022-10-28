public class Proveedor {
Almacen almacen;

    public Proveedor(Almacen almacen) {
        this.almacen = almacen;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "almacen=" + almacen +
                '}';
    }
}

