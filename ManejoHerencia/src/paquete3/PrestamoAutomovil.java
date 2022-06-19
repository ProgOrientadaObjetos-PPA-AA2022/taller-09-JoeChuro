/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.ArrayList;
import paquete5.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private ArrayList<PrestamoAutomovil> lista;
    private String tAutomovil;
    private String mAutomovil;
    private Persona garante1;
    private double vAutomovil;
    private double vmAutomovil;

    public PrestamoAutomovil(Persona g, int nm, String cd, String t, String m,
            double va) {
        super(g, nm, cd);
        establecerCiudad(cd);
        garante1 = g;
        tAutomovil = t;
        mAutomovil = m;
        vAutomovil = va;
    }

    public void establecerCiudad(String cd) {
        ciudad = cd.toUpperCase();
    }

    public void establecerLista(ArrayList<PrestamoAutomovil> listado) {
        lista = listado;
    }

    public void establecerGarante(Persona x) {
        garante1 = x;
    }

    public void establecerTipoAutomovil(String x) {
        tAutomovil = x;
    }

    public void establecerMarcaAutomovil(String x) {
        mAutomovil = x;
    }

    public void establecerValorAutomovil(double x) {
        vAutomovil = x;
    }

    public void establecerValorMensualAutomovil() {
        vmAutomovil = vAutomovil / nMeses;
    }

    public ArrayList<PrestamoAutomovil> obtenerLista() {
        return lista;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public String obtenerTipoAutomovil() {
        return tAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return mAutomovil;
    }

    public double obtenerValorAutomovil() {
        return vAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return vmAutomovil;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%s\nTipo: %s\nMarca: %s\n"
                + "Valor: %.2f\nMensualidad: %.2f",
                cadena,
                tAutomovil,
                mAutomovil,
                vAutomovil,
                vmAutomovil);

        return cadena;
    }
}