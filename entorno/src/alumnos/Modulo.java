package alumnos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruizl
 */
public class Modulo {
   private String nombre;
   private String curso;
   private int nota;

    public Modulo() {
    }

    public Modulo(String nombre, String curso, int nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
   
}
