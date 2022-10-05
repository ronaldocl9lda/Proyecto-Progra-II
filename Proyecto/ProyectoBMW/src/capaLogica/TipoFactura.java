/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/**
 *
 * @author anchi
 */
public enum TipoFactura {
    CONTADO{
        @Override
        public String toString() {
            return "Contado";
        }
    },
    CREDITO{
        @Override
        public String toString() {
            return "Crédito";
        }
    }
}
