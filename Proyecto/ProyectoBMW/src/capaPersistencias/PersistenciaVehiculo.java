package capaPersistencias;
import capaLogica.Vehiculo;
import capaLogica.Status;
import capaLogica.TipoVehiculo;
import java.util.ArrayList;
/**
 * Clase que se encarga de la persistencia de vehiculos
 */
public class PersistenciaVehiculo {
    // Se deifne una arreglo de vehiculos
    private static ArrayList<Vehiculo> arrayVehiculos = new ArrayList();
 
    // Metodo que agrega un vehiculo 
    public static void agregarVehiculo(Vehiculo vehiculo){
        arrayVehiculos.add(vehiculo);
    }

    // Metodo que devuelve el arreglo de vehiculos
    public static ArrayList<Vehiculo> getArrayVehiculos() {
        return arrayVehiculos;
    }
    
    // Metodo que devuelve un arreglo de vehiculo filtrando por un tipo de vehiculo especifico
    public static ArrayList<Vehiculo> getArrayVehiculos(TipoVehiculo tipo) {
        // Se define un arrelo auxiliar
        ArrayList<Vehiculo> arrayVehiculosTipo = new ArrayList();
        // Se itera el arreglo de vehiculos
        for(Vehiculo v:arrayVehiculos){
            // Se verifica si el tipo de vehiculo concuerda
            if(v.getTipoVehiculo()==tipo){
                // Se verifica si el vehiculo esta activo
                if(v.getStatus()==Status.ACTIVO){
                    // Se agrega el vehiculo al arreflo auxiliar
                    arrayVehiculosTipo.add(v);
                }
            }
        }
        // Se retorna el arreglo auxiliar
        return arrayVehiculosTipo;
    }
    
    // Metodo que actualiza una posicion expecifica del arreglo de vehiculos con un objeto
    // enciado por parametro
    public static void actualizarVehiculo(int indexVehiculo, Vehiculo vehiculo){
        arrayVehiculos.set(indexVehiculo, vehiculo);
    }
    
    // Metodo que descativa un vehiculo
    public static void desactivarVehiculo(int indice){
        Vehiculo vehiculo;
        vehiculo = arrayVehiculos.get(indice);
        vehiculo.setStatus(Status.INACTIVO);
        actualizarVehiculo(indice,vehiculo);
    }
    
    // Metodo que activa un vehiculo
    public static void activarVehiculo(int indice){
        Vehiculo vehiculo;
        vehiculo = arrayVehiculos.get(indice);
        vehiculo.setStatus(Status.ACTIVO);
        actualizarVehiculo(indice,vehiculo);
    }
    
    // Metodo que devuelve el listado de vehiculos
    public static String listaVehiculos(){
        String hilera = "";
        for(Vehiculo vehiculo:arrayVehiculos){
            hilera += vehiculo.toStringCompleto()+"\n";
        }
        return hilera;
    }
    
    // Meotodo que devuelve el listado de vehiculos por un tipo especifico
    public static String listaVehiculos(TipoVehiculo tv){
        String hilera = "";
        // Se recorre el arreglo de vehiculos
        for(Vehiculo vehiculo:arrayVehiculos){
            // Se filtra por tipo de vwhiculo
            if(vehiculo.getTipoVehiculo()==tv){
                hilera += vehiculo.toStringCompleto()+"\n";
            }
        }
        return hilera;
    }
    
    // Retorna la lista de vehiculo con sus status
    public static String listaVehiculosEsatos(){
        String hilera = "";
        for(Vehiculo vehiculo:arrayVehiculos){
            hilera += vehiculo.getStatus()
                    + " - " + vehiculo.getIdVehiculo() 
                    + " - " + vehiculo.getModelo() + "\n";
        }
        return hilera;
    }
}
