package modelo;

public class MetodoPago {

    private int idMetodoPago;
    private String descripcion;

    public MetodoPago(){

    }

    public MetodoPago(int idMetodoPago, String descripcion) {
        this.idMetodoPago = idMetodoPago;
        this.descripcion = descripcion;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
