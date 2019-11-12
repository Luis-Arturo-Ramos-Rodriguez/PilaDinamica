/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiladinamicaVector;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaVector pila = new PilaVector();
        int x;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Tec1ea número de elementos: ");
        try{
        x = Integer.parseInt(entrada.readLine());
        for (int j=1;j<=x;j++){
        Double  d;
        d = Double.valueOf(entrada.readLine()); 
        pila.insertar(d);
        }        
        System.out.println ("Elementos de la Pila");
        while (!pila.pilaVacia())
        {
        Double d;
        d=(Double)pila.quitar();
        if(d.doubleValue()>0.0){ 
            System.out.print(d + " ");
        }
        }
        }
        catch (Exception er){ 
                    System.err.println("Excepcion: "+er);
        }

    }

    }
