package persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Blanco1996
 *
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String sexo;
    private double altura;
    private double peso;

    public Persona(String nombre, String apellidos, int edad, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int imc() {
        double imc;
        int resultado = 0;

        imc = (this.peso / (this.altura * this.altura));
        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else if (imc > 25) {
            resultado = 1;
        }
        return resultado;
    }

     public boolean mayorE() {
        boolean result = true;
        if (this.edad >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String sexo() {
        String result = "";
        if (this.sexo.equals("H")) {
            result = "H";
        } else if (this.sexo.equals("M")) {
            result = "M";
        } else {
            result = "H";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }

}
