package capaLogica;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Clase que se encarga de los objetos factura
 */
public class Factura {
    //Se define un consecutivo tipo statico
    private static int consecutivoFactura = 0;
    // se defineen los atributos de la factura
    private int numeroFatura;
    private Date fechaFactura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private TipoFactura tipoFactura;
    private ArrayList<Parte> arrayPartesExtra;
    private double total;
    private Status status;

    // Constructor de la clase factura
    public Factura(Cliente cliente, Vehiculo vehiculo, TipoFactura tipoFactura) {
        this.numeroFatura = ++consecutivoFactura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipoFactura = tipoFactura;
        this.total = this.vehiculo.getPrecio();
        this.fechaFactura =  new Date();
        this.status = Status.PENDIENTE;
        this.arrayPartesExtra = new ArrayList();
    }

    // Metodo que establece el cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Metodo que establece el vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    //Metodo que establece el tipo de factura
    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    // metodo que establece el status
    public void setStatus(Status status) {
        this.status = status;
    }

    // metodo que obtiene el numero de factura
    public int getNumeroFatura() {
        return numeroFatura;
    }

    // metodo que obtiene la fecha de la factura
    public Date getFechaFactura() {
        return fechaFactura;
    }

    //metodo que obtiene el cliente
    public Cliente getCliente() {
        return cliente;
    }

    // metodo que obtiene el vehiculo
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // metodo que obtiene el tipodefactura
    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    // metodo que obtiene el status de la fatura
    public Status getStatus() {
        return status;
    }
    
    // Metodo que agrega una extra
    public boolean agregarExtra(Parte parte){
        // variable bandera para veirifcar si la parte existe
        boolean agregada = true;
        // Recorre el arreglo
        for(Parte p:arrayPartesExtra){
            //verifica si la parte ya existe
            if(parte==p){
                //Si la parte existe levanta la bandera a false
                agregada = false;
            }
        }
        //si la parte no exista la agrega
        if(agregada){
            this.arrayPartesExtra.add(parte);
        }
        return agregada;
    }
    
    // metodo que elimina una parte 
    public boolean eliminarParte(Parte parte){
        // variable booleana que verifica si la parte existe en el arreglo
        boolean eliminada = false;
        Parte p;
        // Se define un iterador de tipo parte
        Iterator<Parte> iterador = arrayPartesExtra.iterator();
        // se itera el arreglo de partes extra
        while(iterador.hasNext()){
            p = iterador.next();
            // se verifica si la parte iterada es la parte que buscamos eliminar
            if(parte == p){
                // remueve la parte del arreglo
                iterador.remove();
                // indica que se elimino a la variable booleana
                eliminada = true;
            }
        }
        // devuelve el valor booleana true si se elemino false si no
        return eliminada;
    }
    
    // Calcula el monto de la factura
    public double calcularFactura(){
        double suma = 0;
        //suma en precio del vehiculo
        suma += vehiculo.getPrecio();
        // Recorreo el arreglo de partes extras
        for(Parte extra:arrayPartesExtra){
            // añade al total el valor de la parte
            suma += extra.getPrecio();
        }
        return suma;
    }
    
    //Metodo que calcula el descuento de la factura
    public double calcularDescuento(){
        
        double descuento=0;
        //Verifica si el cliente es corporativo
        if(this.cliente.getTipoCliente()== TipoCliente.CORPORATIVO){
            //Veirica si compro entre 3 y 5 partes extra
            if(arrayPartesExtra.size()>3 && arrayPartesExtra.size()<5){
                descuento += 10;
            }else{
                //verifica si compro en tre 5 y 10 partes extra
                if(arrayPartesExtra.size() >=5 && arrayPartesExtra.size()<10){
                    descuento += 20;
                }
                // verifica si compro mas de 10 partes extra
                else if(arrayPartesExtra.size()>10){
                    descuento += 25;
                }
            }
        // si no es corporatico verifica si compro mas de 10 partes extra
        }else if(arrayPartesExtra.size()>10){
            descuento += 15;
        }
    
        // verifica si es un vehiculo electrico
        if(this.vehiculo.getTipoVehiculo() == TipoVehiculo.ELECTRICO){
            descuento += 5;        
        }else if(this.vehiculo.getTipoVehiculo()==TipoVehiculo.HIBRIDO){// verifica si es un vehiculo hibrido
            descuento += 3;
        }
        
        if(this.tipoFactura == TipoFactura.CONTADO){// verifica si la factura es de contado
            descuento += 5;
        }
        
        return calcularFactura()*(descuento/100);
    }
    
    //Meotodo que calcula los impuestos de la factura
    public double calcularImpuestos(){
        return (calcularFactura()-calcularDescuento())*0.13;
    }
    
    //Metodo que calcula el total de la factura con impuestos y descuento
    public void calcularTotal(){
        total = calcularFactura()-calcularDescuento()+calcularImpuestos();
    }
    
    //Meotodo que realiza la conversion
    public double conversionMoneda(){
        return total *630;
    }

    @Override
    public String toString() {
        StringBuilder hilera = new StringBuilder();
        calcularTotal();
        DecimalFormat formatoNumero = new DecimalFormat("# , ##0.00");
        hilera.append("Subtotal:\t$").append(formatoNumero.format(calcularFactura())).append("\n");
        hilera.append("Descuento:\t$").append(formatoNumero.format(calcularDescuento())).append("\n");
        hilera.append("Impuestos:\t$").append(formatoNumero.format(calcularImpuestos())).append("\n");
        hilera.append("Total:\t$").append(formatoNumero.format(total)).append("\n");
        hilera.append("Total:\t₡").append(formatoNumero.format(conversionMoneda())).append("\n");
        hilera.append(vehiculo.toStringCompleto());
        
        if(arrayPartesExtra.size()!=0){ 
            hilera.append("\n\n----- Partes Extras-----\n");
            for(Parte p:arrayPartesExtra){
                hilera.append(p.toString());
                hilera.append("\n");
            }
        }
        return hilera.toString();
    }
}
