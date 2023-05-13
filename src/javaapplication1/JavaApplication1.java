package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notaDeProgra=14.5;
        String cadenaDeTexto;   
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int primerNumero=sc.nextInt();
        System.out.println("Ingrese segundo numero");
        int segundoNumero=sc.nextInt();
        OperacionesAritmeticas calculadora = new OperacionesAritmeticas();
        OperacionesAritmeticas calculadora2 = new OperacionesAritmeticas();
        OperacionesAvanzadas calculadoraAvanzada = new OperacionesAvanzadas();
        System.out.println( "El resultado de la suma es " + calculadora.sumar(primerNumero, segundoNumero));
        System.out.println("El resultado de la resta es "+ calculadora2.restar(primerNumero, segundoNumero));
        System.out.println("El resultado de la operacion es " + calculadoraAvanzada.raizCuadrada(primerNumero) );
    }

    
}
