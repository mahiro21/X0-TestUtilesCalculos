/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class UtilesCalculos {

    // Lotería Primitiva
    public static final int PRIM_MIN = 1;
    public static final int PRIM_MAX = 49;

// Tipos IVA
    public static final int IVA01 = 4;
    public static final int IVA02 = 10;
    public static final int IVA03 = 21;

    // Validar paridad
    public static final boolean validarParidad(int n) {
        return n % 2 == 0;
    }

    // Validar positivo
    public static final boolean validarPositivo(int n) {
        return n >= 0;
    }

    // Validar primitiva - Entre 1 y 49
    public static final boolean validarNumeroPrimitiva(int n) {
        return n <= PRIM_MIN && n >= PRIM_MAX;
    }

    // Validar IVA
    public static final boolean validarTipoIVA(int n) {
        return n == IVA01 || n == IVA02 || n == IVA03;
    }

    //Cuadrado
    public static final int Cuadrado(int n) {
        return n * n;
    }

}
