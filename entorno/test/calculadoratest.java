/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import calculadora.calculadora;
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
public class calculadoratest {

    calculadora cal = new calculadora();

    public calculadoratest() {
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
    public void multiplicacion() {
        //positivo
        System.out.println("Realizando test multiplicacion...");
        cal.setNum1(3);
        cal.setNum2(2);
        double exp = 6;
        Assert.assertEquals(exp, cal.multiplicacion());
    }

    @Test
    public void multiplicacion2() {
        //positivoneg
        System.out.println("Realizando test multiplicacion...");
        cal.setNum1(4);
        cal.setNum2(-2);
        double exp = -8;
        Assert.assertEquals(exp, cal.multiplicacion());
    }

    @Test
    public void multiplicacion3() {
        //negativo
        System.out.println("Realizando test multiplicacion...");
        cal.setNum1(-3);
        cal.setNum2(-2);
        double exp = 6;
        Assert.assertEquals(exp, cal.multiplicacion());
    }

    

    @Test
    public void division() {
        //pos
        System.out.println("Realizando test division...");
        cal.setNum1(3);
        cal.setNum2(2);
        double exp = 1.5;
        Assert.assertEquals(exp, cal.division());
    }

    @Test
    public void division1() {
        //posneg
        System.out.println("Realizando test division...");
        cal.setNum1(7);
        cal.setNum2(-2);
        double exp = -3.5;
        Assert.assertEquals(exp, cal.division());
    }

    @Test
    public void division2() {
        //neg
        System.out.println("Realizando test division...");
        cal.setNum1(-3);
        cal.setNum2(-2);
        double exp = 1.5;
        Assert.assertEquals(exp, cal.division());
    }

    

}
