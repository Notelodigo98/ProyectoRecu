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
public class calificacionmodulotest {

    alumnos al = new alumnos();

    public calificacionmodulotest() {
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
    public void calificam() {
        System.out.println("Empezando test de calificamodulo...");
        al.setNotapractica1(5);
        al.setNotapractica2(7);
        al.setNotapractica3(8);
        al.setNotaexamen(8);
        String exp = "notable";
        Assert.assertEquals(exp, al.calificacionModulo());
    }

    @Test
    public void calificam2() {
        System.out.println("Empezando test de calificamodulo...");
        al.setNotapractica1(3);
        al.setNotapractica2(4);
        al.setNotapractica3(10);
        al.setNotaexamen(3);
        String exp = "suspenso";
        Assert.assertEquals(exp, al.calificacionModulo());
    }

    @Test
    public void calificam3() {
        System.out.println("Empezando test de calificamodulo...");
        al.setNotapractica1(10);
        al.setNotapractica2(5);
        al.setNotapractica3(9);
        al.setNotaexamen(9);
        String exp = "notable";
        Assert.assertEquals(exp, al.calificacionModulo());
    }

    @Test
    public void calificam4() {
        System.out.println("Empezando test de calificamodulo...");
        al.setNotapractica1(0);
        al.setNotapractica2(4);
        al.setNotapractica3(2);
        al.setNotaexamen(1);
        String exp = "suspenso";
        Assert.assertEquals(exp, al.calificacionModulo());
    }

    @Test
    public void calificam5() {
        System.out.println("Empezando test de calificamodulo...");
        al.setNotapractica1(7);
        al.setNotapractica2(9);
        al.setNotapractica3(4);
        al.setNotaexamen(5);
        String exp = "suficiente";
        Assert.assertEquals(exp, al.calificacionModulo());
    }
}
