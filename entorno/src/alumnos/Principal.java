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

import alumnos.Modulo;
import alumnos.Alumno;
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos del grupo: ");
        int nalumnos = so.nextInt();
        so.nextLine();
        Alumno[] alumnitos = new Alumno[nalumnos];

        for (int i = 0; i < alumnitos.length; i++) {
            Scanner s = new Scanner(System.in);
            alumnitos[i] = new Alumno();
            System.out.println("Introduce el nombre del alumno " + (i + 1) + ": ");
            String nombre = s.nextLine();
            alumnitos[i].setNombre(nombre);
            System.out.println("Introduce los apellidos del alumno " + (i + 1) + ": ");
            String apellidos = s.nextLine();
            alumnitos[i].setApellidos(apellidos);
            System.out.println("Introduce la dirección del alumno " + (i + 1) + ": ");
            String direccion = s.nextLine();
            alumnitos[i].setDireccion(direccion);
            System.out.println("Introduce el telefono del alumno " + (i + 1) + ": ");
            String telefono = s.nextLine();
            alumnitos[i].setTelefono(telefono);
            System.out.println("Introduce el curso  del alumno " + (i + 1) + ": ");
            String curso = s.nextLine();
            alumnitos[i].setCurso(curso);
            System.out.println("Introduce la nota de programacion del alumno " + (i + 1) + ": ");
            int notap = s.nextInt();
            Modulo programacioN = new Modulo("programacion", "1ºDaw", notap);
            alumnitos[i].setProgramacion(programacioN);
            System.out.println("Introduce la nota de Lenguaje de marcas del alumno " + (i + 1) + ": ");
            notap = s.nextInt();
            Modulo lMarc = new Modulo("Lenguaje de marcas", "1ºDaw", notap);
            alumnitos[i].setLenguajeMarc(lMarc);
            System.out.println("Introduce la nota de sistemas informaticos del alumno " + (i + 1) + ": ");
            notap = s.nextInt();
            Modulo sistemInf = new Modulo("sistemas informaticos", "1ºDaw", notap);
            alumnitos[i].setSistemasInfo(sistemInf);
            System.out.println("Introduce la nota de base de datos del alumno " + (i + 1) + ": ");
            notap = s.nextInt();
            Modulo bD = new Modulo("Base de datos", "1ºDaw", notap);
            alumnitos[i].setBaseDatos(bD);
            System.out.println("Introduce la nota de entorno de desarrollo del alumno " + (i + 1) + ": ");
            notap = s.nextInt();
            Modulo entornoD = new Modulo("entorno de desarrollo", "1ºDaw", notap);
            alumnitos[i].setEntorno(entornoD);
        }
        System.out.println("----------------LISTADO DE NOTAS----------------------------------");
        for (int i = 0; i < alumnitos.length; i++) {
            System.out.println("Datos del alumno " + (i + 1) + ": " + alumnitos[i].getNombre() + " " + alumnitos[i].getApellidos() + "\nCurso: " + alumnitos[i].getCurso() + "\nDirección: " + alumnitos[i].getDireccion() + "\nTelefono: " + alumnitos[i].getTelefono()
                    + "\nNota media: " + ((alumnitos[i].getBaseDatos().getNota() + alumnitos[i].getEntorno().getNota() + alumnitos[i].getLenguajeMarc().getNota() + alumnitos[i].getSistemasInfo().getNota() + alumnitos[i].getProgramacion().getNota()) / 5));
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
        }
    }

}
