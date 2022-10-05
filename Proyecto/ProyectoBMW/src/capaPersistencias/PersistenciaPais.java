package capaPersistencias;
import capaLogica.Pais;
import capaLogica.Status;
import java.util.ArrayList;
/**
 * Clase que se encarga de la persistencia de paises
 */
public class PersistenciaPais {
    // Define el arreglo de paises
    private static ArrayList<Pais> arrayPaises = new ArrayList();
 
    //Metodo que agrega un pais al arreglo
    public static void agregarPais(Pais pais){
        arrayPaises.add(pais);
    }
    
    //Metodo que retorna el arreglo de clientes
    public static ArrayList<Pais> getArrayPaises() {
        return arrayPaises;
    }
    
    //Metodo que retorna los paises activos presentes en el arreglo
    public static ArrayList<Pais> getArrayPaisesActivos() {
        //Define un arreglo auxiliar para los paises activos
        ArrayList<Pais> arrayAuxiliar = new ArrayList();
        //Itera a traves de el arreglo de paises
        for(Pais p:arrayPaises){
            //Pregunta si el pais esta activo
            if(p.getStatus()== Status.ACTIVO){
                //Agrega el pais al arreglo auxiliar
                arrayAuxiliar.add(p);
            }
        }
        //retorna el arreglo auxiliar
        return arrayAuxiliar;
    }
    
    // Metodo que actualiza el arreglo de paises con un pais 
    // pasada por parametro junto con la posicion del arreglo a actualizar
    public static void actualizarPais(int indexPais, Pais pais){
        arrayPaises.set(indexPais, pais);
    }
    
    //Metodo que desactivo un pais ubicado en la posicion dada por parametro
    public static void desactivarPais(int indice){
        // Define una variable pais
        Pais pais;
        // Obtiene el pais especifico del arreglo
        pais = arrayPaises.get(indice);
        // Cambioa el status a inactivo
        pais.setStatus(Status.INACTIVO);
        // Manda a actualizar el pais en el arreglo
        actualizarPais(indice,pais);
    }
    
    //Metodo que activa un pais ubicado en la posicion dada por parametro
    public static void activarPais(int indice){
        // Define una variable pais
        Pais pais;
        // Obtiene el pais especifico del arreglo
        pais = arrayPaises.get(indice);
        // Cambioa el status a activo
        pais.setStatus(Status.ACTIVO);
        // Manda a actualizar el pais en el arreglo
        actualizarPais(indice,pais);
    }
    
    // Metodo que retorna la lista de paises
    public static String listaPaises(){
        //define una variable string para la concatenacion
        String hilera = "";
        //Recorre el arreglo de paises
        for(Pais pais:arrayPaises){
            // Concatena el toString de cada pais
            hilera += pais.toString()+"\n";
        }
        //Devuelve la variable con la concatenacion
        return hilera;
    }
    
    // Metodo que retorna la lista de los estados de los paises
    public static String listaPaisesEstados(){
        //define una variable string para la concatenacion
        String hilera = "";
        //Recorre el arreglo de paises
        for(Pais pais:arrayPaises){
            // Concatena el estado, el codigo y el nombre de cada pais
            hilera += pais.getStatus() 
                    + " - " + pais.getCodigo() 
                    + " - " + pais.getNombre() +"\n";
        }
        //Devuelve la variable con la concatenacion
        return hilera;
    }
}
