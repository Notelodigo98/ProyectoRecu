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
public class Calculadora2 {
    double n1;
    double n2;
    String marca;
    String modelo;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Calculadora2() {
    }

    public Calculadora2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Calculadora2(double n1, double n2, String marca, String modelo) {
        this.n1 = n1;
        this.n2 = n2;
        this.marca = marca;
        this.modelo = modelo;
    }
    
}
