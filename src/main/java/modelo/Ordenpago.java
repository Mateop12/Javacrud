package modelo;

public class Ordenpago {

    private int pago_id;
    private int usuario_id;
    private int metodo_pago_id;
    private String fecha_pago;
    private double monto;

    public Ordenpago(){

    }

    public Ordenpago(int pago_id, int usuario_id, int metodo_pago_id, String fecha_pago, double monto) {
        this.pago_id = pago_id;
        this.usuario_id = usuario_id;
        this.metodo_pago_id = metodo_pago_id;
        this.fecha_pago = fecha_pago;
        this.monto = monto;
    }

    public int getPago_id() {
        return pago_id;
    }

    public void setPago_id(int pago_id) {
        this.pago_id = pago_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id() {
        this.usuario_id = usuario_id;
    }

    public int getMetodo_pago_id() {
        return metodo_pago_id;
    }

    public void setMetodo_pago_id(int metodo_pago_id) {
        this.metodo_pago_id = metodo_pago_id;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
