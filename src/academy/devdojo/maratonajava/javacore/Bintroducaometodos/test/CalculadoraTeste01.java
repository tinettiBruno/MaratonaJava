package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumTwoNumbers(15, 15);
        calculadora.subtractTwoNumbers(15,1);
        System.out.println("Finalizando calculadora");
    }
}