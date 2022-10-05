/*
Permitira crear cuentas a los clientes para poder registrarse e iniciar sesion, por
eso se hace esta clasificacion de Usuarios, ya que no todos tienen los mismos permisos

 */
package capaLogica;

/**
 *
 * @author RYZEN
 */
public enum TipoUsuario {
    ADMINISTRADOR{
        @Override
        public String toString(){
            return "Administrador";
        }
    },
    VENDEDOR{
        @Override
        public String toString(){
            return "Vendedor";
        }
    },
    REGULAR{
        @Override
        public String toString(){
            return "Regular";
        }
    }
}
