package capaLogica;


/*
Esta clase se encargara de generar una cuenta para que el cliente pueda ingresar a la aplicacion solo si esta registrado o en caso de que vaya a ingresar por primera vez que guarde el 
cliente
 */

/**
 *
 * @author RYZEN
 */
public class Cliente {

    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private TipoCliente tipoCliente;
    private Status estado;
    
    public Cliente(String cedula, String nombre, String direccion, String telefono, TipoCliente tipoCliente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoCliente = tipoCliente;
        this.estado = Status.ACTIVO;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    @Override
    public String toString (){
        return cedula + " - " + nombre + "\n";   
    }
    
    public String toStringCompleto (){
        return "Cédula:\t" + cedula + "\n"
                + "Nombre:\t" + nombre + "\n"
                + "Dirección:\t" + direccion + "\n"
                + "Teléfono:\t" + telefono + "\n"
                + "Cliente Tipo:\t" + tipoCliente + "\n";   
    }
    
    public String toStringEstado(){
        return estado + " - " + cedula + " - " +nombre+"\n";
    }
}
