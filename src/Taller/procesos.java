/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import javax.swing.*;
import java.math.BigDecimal;

public class procesos {
    JLabel casilla;
    private BigDecimal primerNumero;
    private BigDecimal segundoNumero;
    private String operador;
    private boolean mostrandoResultado = false;

    public procesos(JLabel casilla) {
        this.casilla = casilla;
    }

    public void dividir() {
        primerNumero = new BigDecimal(casilla.getText());
        operador = "/";
        casilla.setText("");
    }

    public void multiplicar() {
        primerNumero = new BigDecimal(casilla.getText());
        operador = "*";
        casilla.setText("");
    }

    public void restar() {
        primerNumero = new BigDecimal(casilla.getText());
        operador = "-";
        casilla.setText("");
    }

    public void limpiar() {
        casilla.setText("");
    }

    public void numeros() {
        numero("7");
    }

    public void numero(String num) {
        if (mostrandoResultado) {
            casilla.setText(num);
            mostrandoResultado = false;
        } else {
            casilla.setText(casilla.getText() + num);
        }
    }

    public void punto() {
        if (!casilla.getText().contains(".")) {
            casilla.setText(casilla.getText() + ".");
        }
    }

    public void suma() {
        primerNumero = new BigDecimal(casilla.getText());
        operador = "+";
        casilla.setText("");
    }

    public void igual() {
        segundoNumero = new BigDecimal(casilla.getText());

        BigDecimal resultado = BigDecimal.ZERO;
        switch (operador) {
            case "+":
                resultado = primerNumero.add(segundoNumero);
                break;
            case "-":
                resultado = primerNumero.subtract(segundoNumero);
                break;
            case "*":
                resultado = primerNumero.multiply(segundoNumero);
                break;
            case "/":
                if (segundoNumero.compareTo(BigDecimal.ZERO) == 0) {
                    casilla.setText("No se divide por 0");
                    return;
                } else {
                    resultado = primerNumero.divide(segundoNumero, BigDecimal.ROUND_HALF_UP);
                }
                break;
        }

        casilla.setText(entero(resultado));
        mostrandoResultado = true;
    }

    private String entero(BigDecimal result) {
    if (result.scale() <= 0 || result.stripTrailingZeros().scale() <= 0) {
        return result.toBigInteger().toString();
    } else {
        return result.stripTrailingZeros().toPlainString();
    }
}
}