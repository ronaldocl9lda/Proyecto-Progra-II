package capaLogica;

public enum Status {
    ACTIVO{
        @Override
        public String toString() {
            return "Activo";
        }
    },
    INACTIVO{
        @Override
        public String toString() {
            return "Inactivo";
        }
    },
    PENDIENTE{
        @Override
        public String toString() {
            return "Pendiente";
        }
    },
    CANCELADA{
        @Override
        public String toString() {
            return "Cancelada";
        }
    },
    VENCIDA{
        @Override
        public String toString() {
            return "Vencida";
        }
    },
}
