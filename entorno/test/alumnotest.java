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
public class alumnotest {

    alumnos al = new alumnos();

    public alumnotest() {
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
        al.setNotaexamen(3);
        double exp = 4.2;
        Assert.assertEquals(exp, al.notamodulo());
    }

    @Test
    public void calificam() {
        System.out.println("Empezando test de calificamodulo...");
        al.setNotapractica1(5);
        al.setNotapractica2(7);
        al.setNotapractica3(8);
        al.setNotaexamen(3);
        String exp = "suspenso";
        Assert.assertEquals(exp, al.calificacionModulo());
    }

    @Test
    public void notasp() {
        System.out.println("Empezando test de notaspracticas...");
        al.setNotapractica1(5);
        al.setNotapractica2(7);
        al.setNotapractica3(8);
        boolean exp = true;
        Assert.assertEquals(exp, al.notaspracticas());
    }
}
