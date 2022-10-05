package capaLogica;

public class Parte {
    private static int consecutivoParte=0;
    private int numeroParte;
    private String descripcion;
    private String modelo;
    private double precio;
    private EstadoParte estadoParte;
    private Status status;
    

    public Parte(String descripcion, String modelo, double precio, EstadoParte estadoParte) { //Método Constructor
        this.numeroParte = ++consecutivoParte;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.precio = precio;
        this.estadoParte = estadoParte;
        this.status = Status.ACTIVO;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    public String toStringCompleto() { //Método toString de la Clase Parte
        return "Número:\t"+ numeroParte + "\n"
                + "Descripcion:\t"+descripcion + "\n"
                + "Modelo:\t"+modelo+"\n"
                + "Precio:\t"+precio + "\n"
                + "Estado:\t" + estadoParte + "\n";
    }
    
    //Métodos SET y GET

    public int getNumeroParte() {
        return numeroParte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoParte getEstadoParte() {
        return estadoParte;
    }

    public void setEstadoParte(EstadoParte estadoParte) {
        this.estadoParte = estadoParte;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public String toStringEstado(){
        return status + " - " + numeroParte+ " - " +descripcion+"\n";
    }
}
