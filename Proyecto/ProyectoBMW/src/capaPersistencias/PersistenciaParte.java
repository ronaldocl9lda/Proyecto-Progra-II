package capaPersistencias;
import capaLogica.Parte;
import capaLogica.Status;
import capaLogica.Vehiculo;
import java.util.ArrayList;
/**
 * Clase que se encarga de la persistencia de partes
 */
public class PersistenciaParte {
    // Define el arreglo de partes
    private static ArrayList<Parte> arrayPartes = new ArrayList();
 
    //Metodo que agrega una parte al arreglo
    public static void agregarParte(Parte parte){
        arrayPartes.add(parte);
    }

     //Metodo que retorna el arreglo de clientes
    public static ArrayList<Parte> getArrayPartes() {
        return arrayPartes;
    }
    
    //Metodo que retorna las partes activas presentes en el arreglo
    public static ArrayList<Parte> getArrayPartesActivas() {
        //Define un arreglo auxiliar para las partes activas
        ArrayList<Parte> arrayAuxiliar = new ArrayList();
        //Itera a traves de el arreglo de partes
        for(Parte p:arrayPartes){
            //Pregunta si la parte esta activo
            if(p.getStatus()== Status.ACTIVO){
                //Agrega el pais al arreglo auxiliar
                arrayAuxiliar.add(p);
            }
        }
        //retorna el arreglo auxiliar
        return arrayAuxiliar;
    }
    
    // Metodo que retorna un arreglo de partes que no esten incluidas en un vehiculo especifico
    public static ArrayList<Parte> getArrayPartesExtras(Vehiculo vehiculo) {
        // se delcara variable booleana
        boolean existe;
        // se clara una arreglo auxiliar de tipo parte
        ArrayList<Parte> arrayAuxiliar= new ArrayList();
        // se recorrre el arreglo de partes
        for(Parte parte:arrayPartes){
            // se establece el valor inicial para la variable booleana
            existe = false;
            //se recorren las partes asociadas al vehiculo
            for(Parte p:vehiculo.getArrayPartes()){
                //verifica si la parte iterada esta activa
                if(parte.getStatus()==Status.ACTIVO){
                    if(parte==p){
                        // se cambia el valor de la variable booleana 
                        // para indicar que la parte existe en el vehiculo
                        existe = true;
                    }
                }else{
                    existe = true;
                }
            }
            // Verifica que la parte no exista en el vehiculo
            if(!existe){
                // se agrega la parte al arreglo auxiliar
                arrayAuxiliar.add(parte);
            }
        }
        // retorna el arreglo auxiliar
        return arrayAuxiliar;
    }
      
    // Metodo que actualiza el arreglo de partes con una parte 
    // pasada por parametro junto con la posicion del arreglo a actualizar
    public static void actualizarParte(int indexParte, Parte parte){
        arrayPartes.set(indexParte, parte);
    }
    
    //Metodo que desactivo una parte ubicado en la posicion dada por parametro
    public static void desactivarParte(int indice){
        // Define una variable parte
        Parte parte;
        // Obtiene la parte especifico del arreglo
        parte = arrayPartes.get(indice);
        // Cambioa el status a inactivo
        parte.setStatus(Status.INACTIVO);
        // Manda a actualizar la parte en el arreglo
        actualizarParte(indice,parte);
    }
    
    //Metodo que activa una parte ubicado en la posicion dada por parametro
    public static void activarParte(int indice){
        // Define una variable parte
        Parte parte;
        // Obtiene la parte especifico del arreglo
        parte = arrayPartes.get(indice);
        // Cambioa el status a inactivo
        parte.setStatus(Status.ACTIVO);
        // Manda a actualizar la parte en el arreglo
        actualizarParte(indice,parte);
    }
    
    // Metodo que retorna la lista de partes
    public static String listaPartes(){
        // Variable auxiliar usada para la concatenacion
        String hilera = "";
        // Se recorre el arreglo de partes
        for(Parte parte:arrayPartes){
            // Se concatena el toString de cada parte
            hilera += parte.toStringCompleto()+"\n";
        }
        // Se retrona la concatenacion
        return hilera;
    }
    
    // Metodo que retorna la lista de partes con el status
    public static String listaPartesEstados(){
        // Se define variable auxiliar para la concatenacion
        String hilera = "";
        // Se recorre el arreglo de parte
        for(Parte parte:arrayPartes){
            // Se concatena el status, el numero de parte y la descripcion
            hilera += parte.getStatus()
                    + " - " + parte.getNumeroParte()
                    + " - " + parte.getDescripcion() + "\n";
        }
        // se retorna la variable auxiliar
        return hilera;
    }
}
