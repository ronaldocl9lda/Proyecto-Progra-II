/*
Este clase trata de asegurar la cuenta del usuario, mediante diferentes 
variables y metodos para verificar los datos de la persona 
 */
package capaLogica;

/**
 *
 * @author RYZEN
 */
public class Usuario {

    private String correo;
    private String usuario;
    private String clave;
    private String nombre;
    private Pais   pais;
    private TipoUsuario tipoUsuario;
    private Status status;
    
    
    public Usuario() {
    }

    public Usuario(String correo, String usuario, String clave, String nombre, Pais pais, TipoUsuario tipoUsuario) {
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.pais = pais;
        this.tipoUsuario = tipoUsuario;
        this.status = Status.ACTIVO;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return usuario+" - " +nombre+"\n";
    }
      
    public String toStringCompleto(){
        return "Usuario:\t"+usuario+"\n"
            + "Nombre:\t"+nombre+"\n"
            + "Tipo Usuario:\t"+tipoUsuario+"\n"
            + "Correo:\t"+correo+"\n"
            + "Pais:\t"+pais+"\n";
    }
    
    public String toStringEstado(){
        return status + " - " + usuario+ " - " +nombre+"\n";
    }
}
