package com.mycompany.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    //  Faça uma calculadora que some, subtraia, multiplique e divida, mostrando o resultado do calculo mo final.
    public static void main(String[] args) {
        
        Scanner teclado2 = new Scanner(System.in);
        
        Double a,b;
        String avance = " ";
        
        
        System.out.println("Hora de calcular :)");
        avance = teclado2.nextLine();
        
        System.out.println("Digite o primeiro número:");
        a = teclado2.nextDouble();
        System.out.println("Digite o segundo número:");
        b = teclado2.nextDouble();
        System.out.println("Resultado:"); 
        System.out.println(a+b); 
        
        //System.out.println("Digite aqui:");
        //int c,d;
        //c = teclado2.nextInt();
        //d = teclado2.nextInt();
        //System.out.println(c-d);
        
        //System.out.println("Digite aqui:");
        //int e,f;
        //e = teclado2.nextInt();
        //f = teclado2.nextInt();
        //System.out.println(e*f);
        
        //System.out.println("Digite aqui:");
        //int g,h;
        //g = teclado2.nextInt();
        //h = teclado2.nextInt();
        //System.out.println(g/h);
        
        
    }
}
