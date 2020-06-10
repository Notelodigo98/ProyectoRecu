/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos2;

/**
 *
 * @author ruizl
 */
public class alumnos {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String módulo;
    private int notapractica1;
    private int notapractica2;
    private int notapractica3;
    private int notaexamen;

    public alumnos() {
    }

    public alumnos(String nombre, String apellidos, String DNI, String módulo, int notapractica1, int notapractica2, int notapractica3, int notaexamen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.módulo = módulo;
        this.notapractica1 = notapractica1;
        this.notapractica2 = notapractica2;
        this.notapractica3 = notapractica3;
        this.notaexamen = notaexamen;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getMódulo() {
        return módulo;
    }

    public void setMódulo(String módulo) {
        this.módulo = módulo;
    }

    public int getNotapractica1() {
        return notapractica1;
    }

    public void setNotapractica1(int notapractica1) {
        this.notapractica1 = notapractica1;
    }

    public int getNotapractica2() {
        return notapractica2;
    }

    public void setNotapractica2(int notapractica2) {
        this.notapractica2 = notapractica2;
    }

    public int getNotapractica3() {
        return notapractica3;
    }

    public void setNotapractica3(int notapractica3) {
        this.notapractica3 = notapractica3;
    }

    public int getNotaexamen() {
        return notaexamen;
    }

    public void setNotaexamen(int notaexamen) {
        this.notaexamen = notaexamen;
    }

    public double notamodulo() {
        double media = 0;
        double mediapracticas = (((this.notapractica1 + this.notapractica2 + this.notapractica3) / 3) * 0.4);
        double mediaexamen = (this.notaexamen * 0.6);
        if (this.notaexamen < 3 || this.notapractica1 < 3 || this.notapractica2 < 3 || this.notapractica3 < 3) {
            return media = 4;
        } else {
            return media = (mediapracticas + mediaexamen);
        }
    }

    public String calificacionModulo() {
        int media = (int) notamodulo();
        if (media <= 4) {
            return "suspenso";
        } else if (media == 5) {
            return "suficiente";
        } else if (media == 6) {
            return "bien";
        } else if (media <= 8) {
            return "notable";
        } else {
            return "sobresaliente";
        }
    }

    public boolean notaspracticas() {
        if (this.notapractica1 > 0 && this.notapractica2 > 0 && this.notapractica3 > 0) {
            return true;
        } else {
            return false;
        }
    }
}
