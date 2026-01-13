package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] nums = {1, 2, 3, 4, 5};
        calculadora.sumArr(nums);

        calculadora.sumVarArgs(nums);
    }
}
