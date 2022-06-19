/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete5.Persona;
import paquete5.InstitucionEducativa;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivel;
    private Persona garante2;
    private InstitucionEducativa centroEducativo;
    private double vCarrera;
    private double vmCarrera;

    public PrestamoEducativo(Persona g, int nm, String cd, String n,
            InstitucionEducativa x, double vc) {
        super(nm, cd);
        establecerCiudad(cd);
        garante2 = g;
        nivel = n;
        centroEducativo = x;
        vCarrera = vc;
    }
    public void establecerCiudad(String cd){
        ciudad = cd.toLowerCase();
    }

    public void establecerGarante(Persona x) {
        garante2 = x;
    }

    public void establecerNivelEstudio(String x) {
        nivel = x;
    }

    public void establecerCentroEducativo(InstitucionEducativa x) {
        centroEducativo = x;
    }

    public void establecerValorCarrera(double x) {
        vCarrera = x;
    }

    public void establecerValorMensualCarrer() {
        vmCarrera = vCarrera / nMeses;
        vmCarrera = vmCarrera -(vmCarrera* 10/100);
    }

    public Persona obtenerGarante() {
        return garante2;
    }

    public String obtenerNivelEstudio() {
        return nivel;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return vCarrera;
    }

    public double obtenerValorMensualCarrera() {
        return vmCarrera;
    }
    @Override
    public String toString() {
        String cadena = String.format("%s\nNumero de meses: %d\nCiudad: %s\n", 
                garante2,nMeses, ciudad);
        cadena = String.format("%sNivel: %s\n"
                + "%s\n"
                + "Valor: %.2f\nMensualidad: %.2f",
                cadena,
                nivel,
                centroEducativo,
                vCarrera,
                vmCarrera);
        return cadena;
    }
}
