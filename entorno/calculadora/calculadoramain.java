/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author ruizl
 */
import java.util.Scanner;

public class calculadoramain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        calculadora cal = new calculadora();
        boolean salir = false;
        while (!salir) {
            System.out.println("1-multiplicar\n2-dividir\n3-sumar\n4-restar\n5-Salir");
            int opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca un numero: ");
                    int num1 = s.nextInt();
                    cal.setNum1(num1);
                    System.out.println("Introduzca otro numero: ");
                    int num2 = s.nextInt();
                    cal.setNum2(num2);
                    System.out.println("La multiplicacion es: " + cal.multiplicacion());
                    break;
                case 2:
                    System.out.println("Introduzca un numero: ");
                    num1 = s.nextInt();
                    cal.setNum1(num1);
                    System.out.println("Introduzca otro numero: ");
                    num2 = s.nextInt();
                    cal.setNum2(num2);
                    System.out.println("La multiplicacion es: " + cal.division());
                    break;
                case 3:
                    System.out.println("Introduzca un numero: ");
                    num1 = s.nextInt();
                    cal.setNum1(num1);
                    System.out.println("Introduzca otro numero: ");
                    num2 = s.nextInt();
                    cal.setNum2(num2);
                    System.out.println("La multiplicacion es: " + cal.suma());
                    break;
                case 4:
                    System.out.println("Introduzca un numero: ");
                    num1 = s.nextInt();
                    cal.setNum1(num1);
                    System.out.println("Introduzca otro numero: ");
                    num2 = s.nextInt();
                    cal.setNum2(num2);
                    System.out.println("La multiplicacion es: " + cal.resta());
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }
    }
}
