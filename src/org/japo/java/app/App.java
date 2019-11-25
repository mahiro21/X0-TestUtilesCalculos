/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;
import org.japo.java.libraries.UtilesCalculos;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    int n;

    public final void launchApp() {
        System.out.println("Demo Librería UtilesCalculos");
        System.out.println("============================");
        n = UtilesEntrada.obtener(UtilesEntrada.MSG_USR, UtilesEntrada.MSG_ERR);
        System.out.println("Paridad .........: " + UtilesCalculos.validarParidad(n));
        System.out.println("Positividad .....: " + UtilesCalculos.validarPositivo(n));
        System.out.println("Primitiva .......: " + UtilesCalculos.validarNumeroPrimitiva(n));
        System.out.println("Tipo IVA ........: " + UtilesCalculos.validarTipoIVA(n));
        System.out.println("Cuadrado ........: " + UtilesCalculos.Cuadrado(n));
        
    }
}
