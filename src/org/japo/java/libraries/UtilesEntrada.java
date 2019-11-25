/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String MSG_USR = "Introduce un número ..:";
    public static final String MSG_OUT = "Número introducido ...: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    public static final int obtener(String msgUsr, String msgErr) {
        //Numero devolver
        int numero = 0;

        //Proceso entrada
        boolean errorOk = true;
        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextInt();
                errorOk = false;

            } catch (Exception e) {
                //Mensaje error
                System.out.println(MSG_ERR);

                //Separador
                System.out.println("---");
            } finally {
                SCN.nextLine();
            }

        } while (errorOk);
        System.out.println("---");
        return numero;
    }

}
