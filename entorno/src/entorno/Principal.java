/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entorno;

/**
 *
 * @author ruizl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora casio1 = new Calculadora(50, 15, "Casio", "CRF-147");

        casio1.suma();
        casio1.resta();
        casio1.multiplicacion();
        casio1.division();

        casio1.setNum1(25);
        casio1.suma();
        System.out.println("Los valores de la calculadora son "+casio1.getNum1()+ " y "+casio1.getNum2());
        Calculadora casio2=new Calculadora("casio", "C3PO");
        Calculadora casio3=new Calculadora();
        System.out.println("La marca y el modelo de la calculadora casio2 son "+casio2.getMarca()+ " y "+ casio2.getModelo());
        casio2.setNum1(10);
        casio2.setNum2(2);
        casio2.suma();

    }

}
