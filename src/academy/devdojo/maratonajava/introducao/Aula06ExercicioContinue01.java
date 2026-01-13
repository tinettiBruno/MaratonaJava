package academy.devdojo.maratonajava.introducao;

public class Aula06ExercicioContinue01 {
    public static void main(String[] args) {
        /* Dado o valor de um carro, descubra em até quantas vezes ele pode ser parcelado
           Condição: valorParcela >= 1000 */
        double carPrice = 40000;
        double installmentValue;
        for (int i = (int) carPrice; i >= 1; i--) {
            installmentValue = carPrice / i;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println(i+"x of "+installmentValue+" USD");
        }
    }
}
