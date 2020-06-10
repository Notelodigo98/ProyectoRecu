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
public class Calculadora {

    //Atributos de la calse
    private double num1;
    private double num2;
    private String marca;
    private String modelo;

    //Metodos de la clase
    //constructor
    public Calculadora(double num1, double num2, String marca, String modelo) {
        this.num1 = num1;
        this.num2 = num2;
        this.modelo = modelo;
        this.marca = marca;
    }

    //metodos de funciones de la clase
    public void suma() {

        System.out.println("La suma de " + this.num1 + " y " + this.num2 + " es " + (this.num1 + this.num2));
    }

    public void resta() {

        System.out.println("La resta de " + this.num1 + " y " + this.num2 + " es " + (this.num1 - this.num2));
    }

    public void multiplicacion() {

        System.out.println("La multiplicación de " + this.num1 + " y " + this.num2 + " es " + (this.num1 * this.num2));
    }

    public void division() {

        System.out.println("La division de " + this.num1 + " y " + this.num2 + " es " + (this.num1 / this.num2));
    }

    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
//constructor sobrecargado

    public Calculadora(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;

    }

    //constructor sobrecargado
    public Calculadora() {
    }

}
