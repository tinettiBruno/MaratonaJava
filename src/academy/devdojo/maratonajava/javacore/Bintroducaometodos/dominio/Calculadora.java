package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void sumTwoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public void subtractTwoNumbers(int a, int b) {
        int sub = a - b;
        System.out.println(a + " - " + b + " = " + sub);
    }

    public void multiplyTwoNumbers(int a, int b) {
        int multi = a * b;
        System.out.println(a + " * " + b + " = " + multi);
    }

    public double divideTwoNumbers(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public void sumArr(int[] arrInt) {
        int sum = 0;
        for (int num : arrInt) {
            sum += num;
        }
        System.out.println("A soma dos termos é: " + sum);
    }

    public void sumVarArgs(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("A soma dos termos é: " + sum);
    }
}
