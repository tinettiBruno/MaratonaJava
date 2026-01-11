package academy.devdojo.maratona.java;

public class Aula02TiposPrimiitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 25;
        long ageLong = (long) 25.743; // transforma de double pra long, basicamente trunca com 0 casas decimais
        byte ageByte = 25;
        short ageShort = (short) 25D; // o prefixo "(short)" força o valor a ser inserido na variável, mesmo que não caiba
        double salaryDouble = 2000.0;
        float salaryFloat = 3000.0F; // sufixo F (ou f) específica o tipo do valor
        boolean isSilksongAOverratedGame = true;
        boolean isBolsonaroInnocent = false;
        char character = '\u0041'; // char, unicode ou ascii

        String name = "Frederico Bolas";

        System.out.println("Its age is " + age + " years");
        System.out.println(name);
    }
}
