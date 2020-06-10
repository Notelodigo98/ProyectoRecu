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
public class Alumno {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String curso;
    private Modulo programacion;
    private Modulo sistemasInfo;
    private Modulo lenguajeMarc;
    private Modulo baseDatos;
    private Modulo entorno;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String direccion, String telefono, String curso, Modulo programacion, Modulo sistemasInfo, Modulo lenguajeMarc, Modulo baseDatos, Modulo entorno) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.curso = curso;
        this.programacion = programacion;
        this.sistemasInfo = sistemasInfo;
        this.lenguajeMarc = lenguajeMarc;
        this.baseDatos = baseDatos;
        this.entorno = entorno;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Modulo getProgramacion() {
        return programacion;
    }

    public void setProgramacion(Modulo programacion) {
        this.programacion = programacion;
    }

    public Modulo getSistemasInfo() {
        return sistemasInfo;
    }

    public void setSistemasInfo(Modulo sistemasInfo) {
        this.sistemasInfo = sistemasInfo;
    }

    public Modulo getLenguajeMarc() {
        return lenguajeMarc;
    }

    public void setLenguajeMarc(Modulo lenguajeMarc) {
        this.lenguajeMarc = lenguajeMarc;
    }

    public Modulo getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(Modulo baseDatos) {
        this.baseDatos = baseDatos;
    }

    public Modulo getEntorno() {
        return entorno;
    }

    public void setEntorno(Modulo entorno) {
        this.entorno = entorno;
    }
    
    
}
