/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Alumnos2.alumnos;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruizl
 */
public class notamodulotest {

    alumnos al = new alumnos();

    public notamodulotest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comienzan los tests........");
        System.out.println("");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin de los tests.....");
        System.out.println("-------------------------");
    }

    @Before
    public void setUp() {
        System.out.println("Comineza el test...");
        System.out.println("");
    }

    @After
    public void tearDawn() {
        System.out.println("Finaliza test....");
        System.out.println("");
    }

    @Test
    public void notam() {
        System.out.println("Empezando el test de notamodulo...");
        al.setNotapractica1(5);
        al.setNotapractica2(7);
        al.setNotapractica3(8);
        al.setNotaexamen(8);
        double exp = 7.2;
        Assert.assertEquals(exp, al.notamodulo());
    }

    @Test
    public void notam2() {
        System.out.println("Empezando el test de notamodulo...");
        al.setNotapractica1(3);
        al.setNotapractica2(4);
        al.setNotapractica3(10);
        al.setNotaexamen(3);
        double exp = 3.8;
        Assert.assertEquals(exp, al.notamodulo());
    }

    @Test
    public void notam3() {
        System.out.println("Empezando el test de notamodulo...");
        al.setNotapractica1(10);
        al.setNotapractica2(5);
        al.setNotapractica3(9);
        al.setNotaexamen(9);
        double exp = 8.6;
        Assert.assertEquals(exp, al.notamodulo());
    }

    @Test
    public void notam4() {
        System.out.println("Empezando el test de notamodulo...");
        al.setNotapractica1(0);
        al.setNotapractica2(4);
        al.setNotapractica3(2);
        al.setNotaexamen(1);
        double exp = 4.0;
        Assert.assertEquals(exp, al.notamodulo());
    }

    @Test
    public void notam5() {
        System.out.println("Empezando el test de notamodulo...");
        al.setNotapractica1(7);
        al.setNotapractica2(9);
        al.setNotapractica3(4);
        al.setNotaexamen(5);
        double exp =5.4 ;
        Assert.assertEquals(exp, al.notamodulo());
    }
}
