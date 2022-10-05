package capaLogica;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que se encarga de las personalizaciones
 */
public class Personalizacion {
    
    // Define los atributos para una personalizacion: vehiculo, arreglo de partes extra y el total
    private Vehiculo vehiculo;
    private ArrayList<Parte> arrayPartesExtra;
    private double total;

    // Constructor de la personalizacion
    public Personalizacion(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.total = this.vehiculo.getPrecio();
        this.arrayPartesExtra = new ArrayList();
    }

    // Setea el vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Obtiene el vehiculo
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Metodo que agrega una extra
    public boolean agregarExtra(Parte parte){
        // variable bandera para veirifcar si la parte existe
        boolean agregada = true;
        // Recorre el arreglo
        for(Parte p:arrayPartesExtra){
            //verifica si la parte ya existe
            if(parte==p){
                //Si la parte existe levanta la bandera a false
                agregada = false;
            }
        }
        //si la parte no exista la agrega
        if(agregada){
            this.arrayPartesExtra.add(parte);
        }
        return agregada;
    }
    
    // metodo que elimina una parte 
    public boolean eliminarParte(Parte parte){
        // variable booleana que verifica si la parte existe en el arreglo
        boolean eliminada = false;
        Parte p;
        // Se define un iterador de tipo parte
        Iterator<Parte> iterador = arrayPartesExtra.iterator();
        // se itera el arreglo de partes extra
        while(iterador.hasNext()){
            p = iterador.next();
            // se verifica si la parte iterada es la parte que buscamos eliminar
            if(parte == p){
                // remueve la parte del arreglo
                iterador.remove();
                // indica que se elimino a la variable booleana
                eliminada = true;
            }
        }
        // devuelve el valor booleana true si se elemino false si no
        return eliminada;
    }
    
    // Calcula el total de la factura
    public void calcularTotal(){
        double suma = 0;
        //suma en precio del vehiculo
        suma += vehiculo.getPrecio();
        // Recorreo el arreglo de partes extras
        for(Parte extra:arrayPartesExtra){
            // añade al total el valor de la parte
            suma += extra.getPrecio();
        }
        total = suma;
    }
    
    //Meotodo que realiza la conversion
    public double conversionMoneda(){
        return total *630;
    }
    
    // Metodo to string de la clase
    @Override
    public String toString() {
        // deifne variable tipo string builder
        StringBuilder hilera = new StringBuilder();
        // llama al metodo para calcular el total
        calcularTotal();
        // define una variable decimal format para dar formato a los montos
        DecimalFormat formatoNumero = new DecimalFormat("# , ##0.00");
        // Agrega a la concatenacion el total
        hilera.append("Total:\t$").append(formatoNumero.format(total)).append("\n");
        hilera.append("Total:\t₡").append(formatoNumero.format(conversionMoneda())).append("\n");
        // Concatene el tostring del vehiculo
        hilera.append(vehiculo.toStringCompleto());
        //cerifica si hay partes extras
        if(arrayPartesExtra.size()!=0){
            hilera.append("\n\n----- Partes Extras-----\n");
            // recorre el arreglo de partes extras
            for(Parte p:arrayPartesExtra){
                // concatena el tostring de la parte
                hilera.append(p.toString());
                hilera.append("\n");
            }
        }
        //devuelve la concatenacion
        return hilera.toString();
    }    
}
