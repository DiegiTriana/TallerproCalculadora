/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Taller;

import javax.swing.JLabel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class procesosTest {
    
    private procesos instance;
    private JLabel casilla;

    @Before
    public void setUp() {
        
        casilla = new JLabel();
        instance = new procesos(casilla);
    }

    @Test
    public void testDividirPorCero() {
        casilla.setText("10");
        instance.dividir();
        casilla.setText("0");
        instance.igual();
        assertEquals("No se divide por 0", casilla.getText());
    }

    @Test
    public void testDividir() {
        casilla.setText("10");
        instance.dividir();
        casilla.setText("2");
        instance.igual();
        assertEquals("5", casilla.getText());
    }

    @Test
    public void testMultiplicar() {
        casilla.setText("5");
        instance.multiplicar();
        casilla.setText("4");
        instance.igual();
        assertEquals("20", casilla.getText());
    }

    @Test
    public void testRestar() {
        casilla.setText("15");
        instance.restar();
        casilla.setText("7");
        instance.igual();
        assertEquals("8", casilla.getText());
    }

    @Test
    public void testLimpiar() {
        casilla.setText("123");
        instance.limpiar();
        assertEquals("", casilla.getText());
    }

    @Test
    public void testSuma() {
        casilla.setText("10");
        instance.suma();
        casilla.setText("15");
        instance.igual();
        assertEquals("25", casilla.getText());
    }

    @Test
    public void testSumaLimite() {
        casilla.setText("99999999999999999999999");
        instance.suma();
        casilla.setText("99999999999999999999999");
        instance.igual();
        assertEquals("199999999999999999999998", casilla.getText());
    }

    @Test
    public void testPunto() {
        casilla.setText("1");
        instance.punto();
        assertEquals("1.", casilla.getText());
        instance.punto(); 
        assertEquals("1.", casilla.getText());
    }
    
    public void testSumaValoresNegativos() {
    casilla.setText("-5");
    instance.suma();
    casilla.setText("-3");
    instance.igual();
    assertEquals("-8", casilla.getText());
}

@Test
public void testRestarValoresNegativos() {
    casilla.setText("-10");
    instance.restar();
    casilla.setText("-7");
    instance.igual();
    assertEquals("-3", casilla.getText());
}

@Test
public void testMultiplicarValoresDecimales() {
    casilla.setText("2.5");
    instance.multiplicar();
    casilla.setText("4.2");
    instance.igual();
    assertEquals("10.5", casilla.getText());
}

@Test
public void testDividirValoresDecimales() {
    casilla.setText("5.6");
    instance.dividir();
    casilla.setText("2.8");
    instance.igual();
    assertEquals("2", casilla.getText());
}

    
}