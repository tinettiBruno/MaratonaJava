package academy.devdojo.maratona.java;



/**
 *  if aqui é semelhante ao C, também da pra omitir as chaves caso exista apenas uma linha, mas não é recomendavel
 */
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 17;
        boolean isLegalAge = age >= 18;
        if (isLegalAge) {
            System.out.println("Pode entrar na casa das primas");
        } else if (age == 17) {
            System.out.println("Ganha uma coquinha gelada, mas ainda não pode entrar na casa das primas");
        } else {
            System.out.println("Não pode entrar na casa das primas");
        }

        // Operador ternario também existe, e é igual do C ou JS
        int salary = (25 > 30) ? 3:4;
        System.out.println(salary);

    }
}
