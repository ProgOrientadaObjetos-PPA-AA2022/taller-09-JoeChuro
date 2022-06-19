/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int nMeses;
    protected String ciudad;

    public Prestamo(Persona b, int m, String c){
        beneficiario = b;
        nMeses = m;
        ciudad = c;
    }
    public Prestamo(int m, String c){
        nMeses = m;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona x) {
        beneficiario = x;
    }

    public void establecerMeses(int x) {
        nMeses = x;
    }

    public void establecerCiudad(String x) {
        ciudad = x;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerMeses() {
        return nMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String toString() {
        String cadena = String.format("%s\nMeses: %d\nCiudad: %s", 
                beneficiario, nMeses, ciudad);
        return cadena;
    }
}