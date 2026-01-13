package academy.devdojo.maratonajava.introducao;

public class Aula06ExercicioBreak01 {
    public static void main(String[] args) {
        // imprima os 25 primeiros números de um dado valor
        int value = 500;
        for (int i = 0; i < value; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
