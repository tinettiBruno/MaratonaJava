package academy.devdojo.maratona.java;

public class Aula06ExercicioBreak02 {
    public static void main(String[] args) {
        /* Dado o valor de um carro, descubra em até quantas vezes ele pode ser parcelado
           Condição: valorParcela >= 1000 */
        double carPrice = 40500;
        double installmentValue;
        for (int i = 1; i <= carPrice; i++) {
            installmentValue = carPrice / i;
            if (installmentValue < 1000) {
                break;
            }
            System.out.println(i+"x of "+installmentValue+" USD");
        }
    }
}
