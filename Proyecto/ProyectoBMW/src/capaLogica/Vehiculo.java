package capaLogica;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Vehiculo {
    private static int consecutivoVehiculo = 0; 
    private int idVehiculo;
    private String modelo;
    private double precio;
    private TipoVehiculo tipoVehiculo;
    private Status status;
    private ArrayList <Parte> arrayPartes;
    
    public Vehiculo (String modelo, double precio, TipoVehiculo tipoVehiculo) { //Método Constructor
        this.idVehiculo = ++consecutivoVehiculo;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
        this.status = Status.ACTIVO;
        arrayPartes = new ArrayList();
    }

    public boolean agregarParte (Parte parte) { //Método para agregar Partes al ArrayList
        boolean agregada = true;
        for(Parte p:arrayPartes){
            if(parte==p){
                agregada = false;
            }
        }
        if(agregada){
            this.arrayPartes.add(parte);
        }
        return agregada;
    }
    
    public boolean eliminarParte(Parte parte){
        boolean eliminada = false;
        Parte p;
        Iterator<Parte> iterador = arrayPartes.iterator();
        while(iterador.hasNext()){
            p = iterador.next();
            if(parte == p){
                iterador.remove();
                eliminada = true;
            }
        }
        return eliminada;
    }

    @Override
    public String toString() {
        return modelo;
    }

    public String toStringCompleto() {
        DecimalFormat formatoNumerico = new DecimalFormat("#,##0.00"); 
        StringBuilder hilera = new StringBuilder(); 
        hilera.append("Modelo: \t").append(modelo);
        hilera.append("\nTipo Vehiculo:\t").append(tipoVehiculo);
        hilera.append("\nPrecio: \t$").append(formatoNumerico.format(precio));
        
        if(arrayPartes.size()!=0){
            hilera.append("\n\n----- Partes del Vehiculo-----\n");
            for(Parte p:arrayPartes){
                hilera.append(p.toString()).append("\n");
            }
        }
        
        hilera.append("\n");
        
        return hilera.toString(); 
    }    
    
    //Métodos SET y GET
    public int getIdVehiculo() {
        return idVehiculo;
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

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Parte> getArrayPartes() {
        return arrayPartes;
    }
}
