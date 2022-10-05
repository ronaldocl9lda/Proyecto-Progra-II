/*
Aqui estan la clasificacion de los clientes que pueden haber en el sistema
 */
package capaLogica;

/**
 *
 * @author RYZEN
 */
public enum TipoCliente {
    PERSONAL{
        @Override
        public String toString() {
            return "Personal";
        }
    },
    CORPORATIVO{
        @Override
        public String toString() {
            return "Corporativo";
        }
    }
}
