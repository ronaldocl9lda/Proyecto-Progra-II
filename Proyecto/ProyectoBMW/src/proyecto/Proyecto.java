/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import capaGrafica.jFrmLogueo;
import capaLogica.Cliente;
import capaLogica.EstadoParte;
import capaLogica.Pais;
import capaLogica.Parte;
import capaLogica.TipoCliente;
import capaLogica.TipoVehiculo;
import capaLogica.Vehiculo;
import capaLogica.Usuario;
import capaLogica.TipoUsuario;
import capaPersistencias.PersistenciaCliente;
import capaPersistencias.PersistenciaPais;
import capaPersistencias.PersistenciaParte;
import capaPersistencias.PersistenciaVehiculo;
import capaPersistencias.PersistenciaUsuario;

/**
 *
 * @author anchi
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cargarDatosIniciales();
        jFrmLogueo principal = new jFrmLogueo();
        principal.setDefaultCloseOperation(principal.EXIT_ON_CLOSE);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
    private static void cargarDatosIniciales(){
        Pais p = new Pais("507","Panamá");
        PersistenciaPais.agregarPais(p);
        p = new Pais("1","Estados Unidos");
        PersistenciaPais.agregarPais(p);
        p = new Pais("505","Nicaragua");
        PersistenciaPais.agregarPais(p);
        p = new Pais("506","Costa Rica");
        PersistenciaPais.agregarPais(p);
        p = new Pais("56", "Chile");
        PersistenciaPais.agregarPais(p);
        
        Parte parte = new Parte("Vidrios Electricos","VE2584A",150,EstadoParte.NUEVA);
        PersistenciaParte.agregarParte(parte);
        Vehiculo v = new Vehiculo("Civic",15000,TipoVehiculo.FOSIL);
        v.agregarParte(parte);
        PersistenciaVehiculo.agregarVehiculo(v);
        v = new Vehiculo("HRV",25000,TipoVehiculo.HIBRIDO);
        v.agregarParte(parte);
        PersistenciaVehiculo.agregarVehiculo(v);
        v = new Vehiculo("Civic LX",20000,TipoVehiculo.FOSIL);
        v.agregarParte(parte);
        PersistenciaVehiculo.agregarVehiculo(v);
        v = new Vehiculo("CRV",35000,TipoVehiculo.ELECTRICO);
        v.agregarParte(parte);
        PersistenciaVehiculo.agregarVehiculo(v);
        parte = new Parte("Polarizado","P2355RT",100,EstadoParte.NUEVA);
        PersistenciaParte.agregarParte(parte);
        parte = new Parte("Rack Techo","RT8795C",300,EstadoParte.NUEVA);
        PersistenciaParte.agregarParte(parte);
        v = new Vehiculo("BMW Serie 3",37000,TipoVehiculo.ELECTRICO);
        v.agregarParte(parte);
        PersistenciaVehiculo.agregarVehiculo(v);
        parte = new Parte("Halogenos","HA2021A",150,EstadoParte.NUEVA);
        PersistenciaParte.agregarParte(parte);
        parte = new Parte("Caja de Cambios","HA2021A",140,EstadoParte.USADA);
        PersistenciaParte.agregarParte(parte);
        v = new Vehiculo("XM",36000,TipoVehiculo.HIBRIDO);
        v.agregarParte(parte);
        
        Usuario u = new Usuario("admin@bmw.com","admin","123","Administrador",p,TipoUsuario.ADMINISTRADOR);
        PersistenciaUsuario.agregarUsuario(u);
        u = new Usuario("vendedor@bmw.com","vendedor","123","Vendedor",p,TipoUsuario.VENDEDOR);
        PersistenciaUsuario.agregarUsuario(u);
        
        u = new Usuario("eliascamposlucas@gmail.com","elias123","elias1","Elias Campos",p,TipoUsuario.REGULAR);
        PersistenciaUsuario.agregarUsuario(u);
        
        u = new Usuario("lizecer@gmail.com","lizecer","lizbeth1","Lizbeth Lucas",p,TipoUsuario.REGULAR);
        PersistenciaUsuario.agregarUsuario(u);
        
        Cliente c = new Cliente("208540321","Juan Perez","San José","77777777",TipoCliente.PERSONAL);
        PersistenciaCliente.agregarCliente(c);
        
        c = new Cliente("172936498","Felipe Lopez","Alajuela","86259810",TipoCliente.CORPORATIVO);
        PersistenciaCliente.agregarCliente(c);
        
        c = new Cliente("800400789","Mauricio Gomez","Guanacaste","89101976",TipoCliente.PERSONAL);
        PersistenciaCliente.agregarCliente(c);
    }
    
}
