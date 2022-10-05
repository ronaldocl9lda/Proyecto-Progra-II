package capaPersistencias;
import capaLogica.Usuario;
import capaLogica.Status;
import java.util.ArrayList;
/**
 * Clase que se encarga de la persistencia de usuarios
 */
public class PersistenciaUsuario {
    // Define un arreglo de usuarios
    private static ArrayList<Usuario> arrayUsuarios = new ArrayList();
 
    // Metodo que agrega un usuario al arreglo
    public static void agregarUsuario(Usuario usuario){
        arrayUsuarios.add(usuario);
    }

    // Metodo que devuelve el arreglo de usuarios
    public static ArrayList<Usuario> getArrayUsuarios() {
        return arrayUsuarios;
    }
    
    //Meotodo que actualiza una posicion especifica del arreglo de usuarios
    // con un nuevo objeto tipo usaurios
    public static void actualizarUsuario(int indexUsuario, Usuario usuario){
        arrayUsuarios.set(indexUsuario, usuario);
    }
    
    // Metodo que se encarga de la desactivacion de un usuariol
    public static void desactivarUsuario(int indice){
        // Definicion de una variable usuario
        Usuario usuario;
        // Obtiene el usuario del arreglo
        usuario = arrayUsuarios.get(indice);
        // se cambia el status a Inactivo
        usuario.setStatus(Status.INACTIVO);
        // se actualiza el usuario
        actualizarUsuario(indice,usuario);
    }
    
    // Metodo que se encarga de la activacion de un usuario
    public static void activarUsuario(int indice){
        // Definicion de una variable usuario
        Usuario usuario;
        // Obtiene el usuario del arreglo
        usuario = arrayUsuarios.get(indice);
        // se cambia el status a activo
        usuario.setStatus(Status.ACTIVO);
        // se actualiza el usuario
        actualizarUsuario(indice,usuario);
    }
    
    // Metodo que retorna la lista de usuarios
    public static String listaUsuarios(){
        // Se define una variable para la concatenacion
        String hilera = "";
        // se recorre el arreglo de usuarios
        for(Usuario usuario:arrayUsuarios){
            // Se concatena el toString de cada usuario
            hilera += usuario.toStringCompleto()+"\n";
        }
        // se retorna la concatenacion
        return hilera;
    }
    
    //Meotodo que busca un usuario en el arreglo y lo devuelve en caso de encontrarlo
    public static Usuario obtenerUsuario(String usuario){
        // define una variable usuario y la inicia en null
        Usuario user = null;
        // recorre el arreglo de usuarios
        for(Usuario u:arrayUsuarios){
            // Si el userid pasado como parametro corresponde con el usuario iterado
            // se asiga el ususario iterado a la variable usuario
            if(u.getUsuario().equalsIgnoreCase(usuario)){
                user = u;
            }
        }
        // se retorna la variable usuario
        return user;
    }
    
    // Metodo que retorna la lista de usuarios con sus estados
    public static String listaUsuariosEstados(){
        // se declara una variable auxiliar
        String hilera = "";
        // se recorre el arreglo de usuarios
        for(Usuario usuario:arrayUsuarios){
            // se concatena el status, el usuario 
            hilera += usuario.getStatus()
                    + " - " + usuario.getUsuario() + "\n";
        }
        // se retorna la concatenacion
        return hilera;
    }
}
