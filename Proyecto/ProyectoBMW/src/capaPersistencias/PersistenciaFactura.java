package capaPersistencias;
import capaLogica.Factura;
import capaLogica.TipoCliente;
import java.util.ArrayList;
/**
 * Clase que se encarga de la persistencia de faturas
 */
public class PersistenciaFactura {
    // Define el arreglo de facturas
    private static ArrayList<Factura> arrayFacturas = new ArrayList();
 
    //Metodo que agrega una fatura al arreglo
    public static void agregarFactura(Factura factura){
        arrayFacturas.add(factura);
    }

    //Metodo que retorna el arreglo de facturas
    public static ArrayList<Factura> getArrayFacturas() {
        return arrayFacturas;
    }
    
    // Metodo que retorna la lista de facturas
    public static String listaFacturas(){
        //define una variable string para la concatenacion
        String hilera = "";
        //Recorre el arreglo de facturas
        for(Factura factura:arrayFacturas){
            // Concatena el toString de cada factura
            hilera += factura.toString()+"\n";
        }
        //Devuelve la variable con la concatenacion
        return hilera;
    }
    
    // Metodo que retorna la lista de los estados de las facturas por tipo de cliente
    public static String listaFacturas(TipoCliente tc){
        //define una variable string para la concatenacion
        String hilera = "";
        //Recorre el arreglo de facturas
        for(Factura factura:arrayFacturas){
            // Veirifica si el tipo de cliente de la factura concuerda con el tipo de cliente
            // del parametro
            if(factura.getCliente().getTipoCliente()== tc){
                // Concatena el toString de cada factura
                hilera += factura.toString()+"\n";
            }
        }
        //Devuelve la variable con la concatenacion
        return hilera;
    }
}
