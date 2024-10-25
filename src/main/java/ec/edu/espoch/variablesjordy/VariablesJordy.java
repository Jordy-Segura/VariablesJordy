/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.variablesjordy;
import java.util.Scanner;
/**
 *
 * @author jordy
 */
public class VariablesJordy {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        System.out.println("Jordy Segura");
        
        var msm="Jordy Segura";
        System.out.println("mi nombre es "+msm);
        
        System.out.println("número de bits: "+ Double.SIZE);
        System.out.println("número de bytes: "+ Double.BYTES);
        System.out.println("número de máximo: "+ Double.MAX_VALUE);
        System.out.println("número de mínimo: "+ Double.MIN_VALUE);
        
        
        int lados =3;
        if(lados==4){
            System.out.println("Es un cuadrado");
        }else if (lados==3) {
            System.out.println("es un triangulo");
        }else if (lados==0){
            System.out.println("es un circulo");
        }else{
            System.out.println("Figura no existente");
        }
        
        
        int edad=200;
        if (edad>=18){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("no es mayor de edad");
        }
        
        int edad=200;
        
        if (edad>0 && edad<120){
            if (edad>=18){
                System.out.println("es mayor de edad");
            }else{
                System.out.println("no es mayor de edad");
            }
        } else {
            System.out.println("No es correcto");
        }
        
        int lado=5;
        switch (lado){
            case 0:
                System.out.println("circulo");
                break;
            case 3:
                System.out.println("triangulo");
                break;
            case 4:
                System.out.println("cuadrado"); 
                break;
            
            default:
                System.out.println("no existe figura geometrica");
        }      
        
        int menu=4;
        double num1=5, num2=10;
       
        switch(menu){
            case 1:
                System.out.println("----estas sumando----");
                System.out.println("La suma es: "+(num1+num2));
                break;
            case 2:
                System.out.println("----estas restando----");
                System.out.println("La resta es: "+(num1-num2));
                break;
            case 3:
                System.out.println("----estas multiplicando----");
                System.out.println("La multiplicación es: "+(num1*num2));
                break;
            case 4:
                
                if(num2!=0){
                    System.out.println("----estas dividiendo----");
                    System.out.println("La division es: "+(num1/num2));
                    break;
                }else{
                    System.out.println("no existe division para 0");
                }
                break;
            
            default:
                System.out.println("opcion incorrecta");
        }
        
        
        int num=12;
        int tabla=2;
        
        for (int i = 1; i <= num; i=i+1) {
            System.out.println(tabla+" x "+i+" = "+(tabla*i));
        }
        
        int num=12;
        int tabla=2;
        int contador=1;
        while (contador<=num) {            
            System.out.println(tabla+" x "+contador+" = "+(tabla*contador));
            contador++;
        }
        
        
        int num=12;
        int tabla=2;
        int contador=1;
               
        do {            
            System.out.println(tabla+" x "+contador+" = "+(tabla*contador));
            contador++;
        } while (contador<=num);
            System.out.println("Fin del programa");
        
        
        int [] enteros;
        
        enteros=new int[3];
        
        enteros[0]=5;
        enteros[1]=7;
        enteros[2]=9;
        int j=enteros[2];
            
        for (int i = 0; i < 3; i++) {
            System.out.println("entero en la psición "+enteros[i]+" esta en la posición "+i);
        }
        
        System.out.println("ENTERO "+j);
        
        
        int [][] enteros;
        
        enteros=new int[3][3];
        
        enteros[0][0]=5;
        enteros[0][1]=10;
        enteros[0][2]=15;
        enteros[1][0]=20;
        enteros[1][1]=25;
        enteros[1][2]=30;
        enteros[2][0]=35;
        enteros[2][1]=40;
        enteros[2][2]=45;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("elemento: "+enteros[i][j]+" En la posicion "+i+j);
            }
            
        }
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String mensaje=entrada.nextLine();
        System.out.println("Su nombre es "+mensaje);*/
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=entrada.nextInt();
        
                   
        if (edad>0 && edad<120){
            if (edad>=0 && edad<=12){
                System.out.println("eres un niño");
            }else if(edad>=13 && edad<=35){
                System.out.println("eres un joven");
            }else{
                System.out.println("eres un adulto");
            }
        } else {
            System.out.println("Edad incorrecta");
        }
        
       
    }
}
