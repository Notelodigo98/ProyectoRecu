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
public class calculadora {

    private double num1;
    private double num2;
    private String marca;
    private String modelo;

    public calculadora(double num1, double num2, String marca, String modelo) {
        this.num1 = num1;
        this.num2 = num2;
        this.marca = marca;
        this.modelo = modelo;
    }

    public calculadora() {
    }


    // Métodos de funciones de la clase
    public double suma() {
        return (this.num1 + this.num2);
    }

    public double resta() {
        return (this.num1 - this.num2);
    }

    public double multiplicacion() {
        return (this.num1 * this.num2);
    }

    public double division() {
        return (this.num1 / this.num2);
    }

// GETTERS & SETTERS
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
