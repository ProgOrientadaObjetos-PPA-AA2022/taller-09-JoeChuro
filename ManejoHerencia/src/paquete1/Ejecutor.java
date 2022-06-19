/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String nP, aP, uP, nI, sI, cd, ta, ma, nv;
        double va,
         vc;
        int tipoPrestamo, nm;
        boolean bandera = true;
        ArrayList<PrestamoAutomovil> listaAutomovil = new ArrayList<>();
        ArrayList<PrestamoEducativo> listaEducativo = new ArrayList<>();

        do {
            System.out.println("TIPO DE PRESTAMO A INGRESAR\n"
                    + "   1) Prestamo Automovil: \n"
                    + "   2) Prestavo Educativo: ");
            tipoPrestamo = sc.nextInt();
            sc.nextLine();

            if (tipoPrestamo == 1 || tipoPrestamo == 2) {
                System.out.println("Ingrese su nombre: ");
                nP = sc.nextLine();
                System.out.println("Ingrese su apellido: ");
                aP = sc.nextLine();
                System.out.println("Ingrese su username: ");
                uP = sc.nextLine();
                Persona pr = new Persona(nP, aP, uP);
                System.out.println("Ingrese el numero de meses: ");
                nm = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese la ciudad: ");
                cd = sc.nextLine();

                if (tipoPrestamo == 1) {
                    System.out.println("Ingrese el Tipo de automovil: ");
                    ta = sc.nextLine();
                    System.out.println("Ingrese la marca del automovil: ");
                    ma = sc.nextLine();
                    System.out.println("Ingrese el valor de automovil: ");
                    va  = sc.nextDouble();
                    PrestamoAutomovil pa = 
                            new PrestamoAutomovil(pr, nm, cd, ta, ma, va);
                    pa.establecerValorMensualAutomovil();
                    listaAutomovil.add(pa);
                    System.out.println("SALIDA\n "
                            + "1) Para seguir ingresando\n 2) Para salir");
                    int sPrestamo = sc.nextInt();
                    sc.nextLine();
                    if (sPrestamo == 1) {
                        System.out.println("INGRESE OTRO PRESTAMO");
                    } else if (sPrestamo == 2) {
                        bandera = false;
                    }
                }
                if (tipoPrestamo == 2) {
                    System.out.println("Ingrese su nivel de estudio: ");
                    nv = sc.nextLine();
                    System.out.println("Ingrese el nombre del centro educutativo");
                    nI = sc.nextLine();
                    System.out.println("Ingrese las siglas del centro educativo");
                    sI = sc.nextLine();
                    InstitucionEducativa ie = new InstitucionEducativa(nI, sI);
                    System.out.println("Ingrese el valor de la carrera");
                    vc = sc.nextDouble();
                    PrestamoEducativo pe
                            = new PrestamoEducativo(pr, nm, cd, nv, ie, vc);
                    pe.establecerValorMensualCarrer();
                    listaEducativo.add(pe);
                    System.out.println("SALIDA\n "
                            + "1) Para seguir ingresando\n 2)Para salir");
                    int s2Prestamo = sc.nextInt();
                    sc.nextLine();
                    if (s2Prestamo == 1) {
                        System.out.println("INGRESE OTRO PRESTAMO");
                    } else if (s2Prestamo == 2) {
                        bandera = false;
                    }
                }

            } else {
                System.out.println("opcion incorrecta");
                bandera = false;
            }
        } while (bandera);

        for (int i = 0; i < listaAutomovil.size(); i++) {
            System.out.println("-----------------------------------------------");
            String cadenas2 = String.format("PRESTAMO AUTOMOVIL Nº%d", i + 1);
            cadenas2 = String.format("%s\n%s", cadenas2, listaAutomovil.get(i));
            System.out.println(cadenas2);
        }
        for (int i = 0; i < listaEducativo.size(); i++) {
            System.out.println("-----------------------------------------------");
            String cadenas3 = String.format("PRESTAMO EDUCATIVO Nº%d", i + 1);
            cadenas3 = String.format("%s\n%s", cadenas3, listaEducativo.get(i));
            System.out.println(cadenas3);
        }
    }
}