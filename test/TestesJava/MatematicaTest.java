/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesJava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guibson Krause
 * @author Anderson Nascimento
 */
public class MatematicaTest
  {
    private Matematica n;

    public MatematicaTest()
      {
        
      }

    @BeforeClass
    public static void setUpClass()
      {
        
      }

    @AfterClass
    public static void tearDownClass()
      {
        
      }

    @Before
    public void setUp()
      {
        n = new Matematica();
      }

    @After
    public void tearDown()
      {
        
      }

    /**
     * Test of numeroPar method, of class Matematica.
     */
    @Test
    public void testNumeroPar()
      {
        assertEquals(true, n.numeroPar(4));
      }

    /**
     * Test of numeroDivisivel method, of class Matematica.
     */
    @Test
    public void testNumeroDivisivel()
      {
          assertEquals(true, n.numeroDivisivel(10, 2));
      }

    /**
     * Test of areaQuadrado method, of class Matematica.
     */
    @Test
    public void testAreaQuadrado()
      {
        assertEquals(400, n.areaQuadrado(20), 0.0);
      }

    /**
     * Test of areaLosango method, of class Matematica.
     */
    @Test
    public void testAreaLosango()
      {
        assertEquals(450.0, n.areaLosango(30, 30), 0.0);
      }

    /**
     * Test of areaTriangulo method, of class Matematica.
     */
    @Test
    public void testAreaTriangulo()
      {
        assertEquals(800.0, n.areaTriangulo(40, 40), 0.0);
      }

    /**
     * Test of areaPoligonoRegular method, of class Matematica.
     */
    @Test
    public void testAreaPoligonoRegular()
      {
        assertEquals(1250.0, n.areaPoligonoRegular(50, 50), 0.0);
      }

    /**
     * Test of areaTrapezio method, of class Matematica.
     */
    @Test
    public void testAreaTrapezio()
      {
        assertEquals(5400.0, n.areaTrapezio(60, 60, 60), 0.0);
      }

    /**
     * Test of areaCirculo method, of class Matematica.
     */
    @Test
    public void testAreaCirculo()
      {
        assertEquals(15386.0, n.areaCirculo(70), 0.0);
      }

    /**
     * Test of areaLateralCone method, of class Matematica.
     */
    @Test
    public void testAreaLateralCone()
      {
        assertEquals(20096.0, n.areaLateralCone(80, 80), 0.0);
      }

    /**
     * Test of areaEsfera method, of class Matematica.
     */
    @Test
    public void testAreaEsfera()
      {
        assertEquals(101736.0, n.areaEsfera(90), 0.0);
      }

    /**
     * Test of superficieCone method, of class Matematica.
     */
    @Test
    public void testSuperficieCone()
      {
        assertEquals(62800.0, n.superficieCone(100, 100), 0.0);
      }

    /**
     * Test of volumeCubo method, of class Matematica.
     */
    @Test
    public void testVolumeCubo()
      {
        assertEquals(1331000.0, n.volumeCubo(110), 0.0);
      }

    /**
     * Test of volumeParalelepipedo method, of class Matematica.
     */
    @Test
    public void testVolumeParalelepipedo()
      {
        assertEquals(1728000.0, n.volumeParalelepipedo(120, 120, 120), 0.0);
      }

    /**
     * Test of perimetroQuadrado method, of class Matematica.
     */
    @Test
    public void testPerimetroQuadrado()
      {
        assertEquals(16900.0, n.perimetroQuadrado(130, 130), 0.0);
      }

    /**
     * Test of perimetroCirculo method, of class Matematica.
     */
    @Test
    public void testPerimetroCirculo()
      {
        assertEquals(879.2, n.perimetroCirculo(140), 0.0);
      }

  }
