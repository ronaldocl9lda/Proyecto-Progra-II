package capaPersistencias;
import capaLogica.Cliente;
import capaLogica.Status;
import java.util.ArrayList;
/**
 * Clase que se encarga de la persistencia de clientes
 */
public class PersistenciaCliente {
    // Define el arreglo de clientes
    private static ArrayList<Cliente> arrayClientes = new ArrayList();
 
    //Metodo que agrega un cliente al arreglo
    public static void agregarCliente(Cliente cliente){
        arrayClientes.add(cliente);
    }

    //Metodo que retorna el arreglo de clientes
    public static ArrayList<Cliente> getArrayClientes() {
        return arrayClientes;
    }
    
    //Metodo que retorna los clientes activos presentes en el arreglo
    public static ArrayList<Cliente> getArrayClientesActivos() {
        //Define un arreglo auxiliar para los clientes activos
        ArrayList<Cliente> arrayAuxiliar = new ArrayList();
        //Itera a traves de el arreglo de clientes
        for(Cliente c:arrayClientes){
            //Pregunta si el cliente esta activo
            if(c.getEstado()== Status.ACTIVO){
                //Agrega el cliente al arreglo auxiliar
                arrayAuxiliar.add(c);
            }
        }
        //retorna el arreglo auxiliar
        return arrayAuxiliar;
    }
    
    // Metodo que actualiza el arreglo de clientes con un cliente 
    // pasada por parametro junto con la posicion del arreglo a actualizar
    public static void actualizarCliente(int indexCliente, Cliente cliente){
        arrayClientes.set(indexCliente, cliente);
    }
    
    //Metodo que desactivo un cliente ubicado en la posicion data por parametro
    public static void desactivarCliente(int indice){
        // Define una variable cliente
        Cliente cliente;
        // Obtiene el cliente especifico del arreglo
        cliente = arrayClientes.get(indice);
        // Cambioa el status a inactivo
        cliente.setEstado(Status.INACTIVO);
        // Manda a actualizar el cliente en el arreglo
        actualizarCliente(indice,cliente);
    }
    
    //Metodo que activa un cliente ubicado en la posicion data por parametro
    public static void activarCliente(int indice){
        // Define una variable cliente
        Cliente cliente;
        // Obtiene el cliente especifico del arreglo
        cliente = arrayClientes.get(indice);
        // Cambioa el status a inactivo
        cliente.setEstado(Status.ACTIVO);
        // Manda a actualizar el cliente en el arreglo
        actualizarCliente(indice,cliente);
    }
    
    // Metodo que retorna la lista de clientes
    public static String listaClientes(){
        //define una variable string para la concatenacion
        String hilera = "";
        //Recorre el arreglo de clientes
        for(Cliente cliente:arrayClientes){
            // Concatena el toString de cada cliente
            hilera += cliente.toStringCompleto()+"\n";
        }
        //Devuelve la variable con la concatenacion
        return hilera;
    }
    
    // Metodo que retorna la lista de los estados de los clientes
    public static String listaClientesEstados(){
        //define una variable string para la concatenacion
        String hilera = "";
        //Recorre el arreglo de clientes
        for(Cliente cliente:arrayClientes){
            // Concatena el estadi, la cedula y el nombre de cada cliente
            hilera += cliente.getEstado() 
                    + " - " + cliente.getCedula() 
                    + " - " + cliente.getNombre() +"\n";
        }
        //Devuelve la variable con la concatenacion
        return hilera;
    }
}
