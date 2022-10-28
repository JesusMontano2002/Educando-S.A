public class Diligencia {
    Compras compras;
    Cotizacion cotizacion;

    public Diligencia(Compras compras, Cotizacion cotizacion) {
        this.compras = compras;
        this.cotizacion = cotizacion;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    @Override
    public String toString() {
        return "Diligencia{" +
                "compras=" + compras +
                ", cotizacion=" + cotizacion +
                '}';
    }
}
