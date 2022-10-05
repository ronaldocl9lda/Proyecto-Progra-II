package capaPersistencias;

import capaLogica.Usuario;

/**
 * Clase encargada del manejo de logueo de usuarios
 */
public class ControlUsuarios {
    //Define un atributo tipo Usaurio que va a guardar el usuario logueado
    private static Usuario usuarioLogueado;
    
    // Guarda el usuario logueado
    public static void establecerUsuario(Usuario usuario){
        usuarioLogueado = usuario;
    }

    //Obtiene el usuario logueado
    public static Usuario obtenerUsuario(){
        return usuarioLogueado;
    }   
}
