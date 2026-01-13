package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumTwoNumbers(15, 15);
        calculadora.subtractTwoNumbers(15, 1);
        calculadora.multiplyTwoNumbers(2, 10);

        double ratio = calculadora.divideTwoNumbers(10, 5);
        System.out.println("10 / 5 = " + ratio);
        System.out.println("Finalizando calculadora");
    }
}