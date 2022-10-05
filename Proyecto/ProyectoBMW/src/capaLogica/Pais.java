/*
Aqui estan todo lo referente al nombre y el codigo de los paises
 */
package capaLogica;

/**
 *
 * @author RYZEN
 */
public class Pais {
  private String codigo;
  private String nombre;
  private Status status;

    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.status = Status.ACTIVO;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return codigo + "  -  " + nombre;
    }
    
    public String toStringEstado(){
        return status + " - " + codigo + " - " +nombre+"\n";
    }
}
