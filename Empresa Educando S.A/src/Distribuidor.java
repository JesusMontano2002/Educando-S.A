public class Distribuidor {
    Almacen almacen;

    public Distribuidor(Almacen almacen) {
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
        return "Distribuidor{" +
                "almacen=" + almacen +
                '}';
    }
}
