package capaLogica;


public enum TipoVehiculo {
    FOSIL{
        public String toString() {
            return "Fósil";
        }
    },
    ELECTRICO {
        public String toString() {
            return "Eléctrico";
        }
    },
    HIBRIDO {
        public String toString() {
            return "Híbrido";
        }
    }
    
}
