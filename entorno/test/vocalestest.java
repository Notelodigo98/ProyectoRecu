/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import String.cuentaVocales;
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
public class vocalestest {

    public vocalestest() {
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
    public void cuentavocale() {
        System.out.println("Empieza el test de cuentavocales...");

        int exp = 2;
        Assert.assertEquals(exp, cuentaVocales.cuentaVocales("lunes"));
    }

    @Test
    public void cuentavocale1() {
        System.out.println("Empieza el test de cuentavocales1...");

        int exp = 5;
        Assert.assertEquals(exp, cuentaVocales.cuentaVocales("murcielago"));
    }

    @Test
    public void cuentavocale2() {
        System.out.println("Empieza el test de cuentavocales2...");

        int exp = 2;
        Assert.assertEquals(exp, cuentaVocales.cuentaVocales("brocha"));
    }

    @Test
    public void cuentavocale3() {
        System.out.println("Empieza el test de cuentavocales3...");

        int exp = 5;
        Assert.assertEquals(exp, cuentaVocales.cuentaVocales("estanteria"));
    }

    @Test
    public void cuentavocale4() {
        System.out.println("Empieza el test de cuentavocales4...");

        int exp = 6;
        Assert.assertEquals(exp, cuentaVocales.cuentaVocales("estetoscopio"));
    }

    @Test
    public void inversa() {
        System.out.println("Empieza el test inviertecasena...");

        String exp = "aloh";
        Assert.assertEquals(exp, cuentaVocales.invierteCadena("hola"));
    }

}
