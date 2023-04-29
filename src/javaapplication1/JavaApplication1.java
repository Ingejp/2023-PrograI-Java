package javaapplication1;

public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primerNumero=123;
        double notaDeProgra;
        String cadenaDeTexto;
        notaDeProgra=14.5;
        cadenaDeTexto="Hola a todos";        
        System.out.println("Hola a todos mi nota de progra es " 
                + notaDeProgra);
        
        OperacionesAritmeticas calculadora;
        calculadora = new OperacionesAritmeticas();
        
        OperacionesAritmeticas calculadora2 = new OperacionesAritmeticas();
        
        //PRIMERA FORMA DE HACERLO
        //int resultado=calculadora.sumar(10, 5);
        //System.out.println(resultado);
        
        //SEGUNDA FORMA (RESUMIDO)
        System.out.println(calculadora.sumar(10, 8));
        System.out.println(calculadora2.restar(100, 25));
        if(notaDeProgra>7){
            for(int i=0; i<=1000; i++){
                System.out.println("Gané el examen");
            }            
        }else{
            System.out.println(":(");
        }
        
        while(notaDeProgra<14){
            System.out.println(":)");
            notaDeProgra=15;
        }
        
        
        
        
    }

    
}
