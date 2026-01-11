package academy.devdojo.maratona.java;

public class Aula06ExercicioFor {
    public static void main(String[] args) {
        // imprima todos os pares de 0 à 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
        }
    }
}
