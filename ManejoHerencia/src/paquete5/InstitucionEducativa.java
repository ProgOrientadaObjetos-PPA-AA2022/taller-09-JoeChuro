/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Joe
 */
public class InstitucionEducativa {

    private String nInstitucion;
    private String sInstitucion;

    public InstitucionEducativa(String n, String s) {
        nInstitucion = n;
        sInstitucion = s;
    }
    public void establecerNombreInstitucion(String x){
        nInstitucion = x;
    }
    public void establecerSiglasInstitucion(String x){
        sInstitucion = x;
    }
    public String obtenerNombreInstitucion(){
        return nInstitucion;
    }
    public String obtenerSiglasInstitucion(){
        return sInstitucion;
    }
    @Override
    public String toString(){
    String cadena = String.format("Institucion: %s\nSiglas: %s", 
            nInstitucion, sInstitucion);
    return cadena;
    }
}
