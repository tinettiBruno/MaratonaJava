package academy.devdojo.maratona.java;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2 + "<-Aqui somou/Aqui concatenou->" + n2 + n1);
        int sum = n1 + n2;
        System.out.println("Resultado = " + sum);

        // A RAZÃO ENTRE DOIS NUMEROS INTEIROS SEMPRE RETORNA UM NUMERO INTEIRO
        double ratio = n1 / n2; // retorna 0.0
        System.out.println(ratio);
        ratio = (double) n1 / n2; /* "converte" n1 para double, assim o resultado sera double;
                                  obs: só um precisa ser double, casting aqui é feio, mas funciona */
        System.out.println(ratio);


        /*
         * Aqui teria os operadores lógicos, mas é igual/semelhante à C ou python

         && (and) || (or) ! (not)

         = += -= /= *= %= ++/-- também existem
         */
        int i = 0;
        System.out.println(i++); // imprime 0 primeiro e incrementa 1
        System.out.println(++i); // incrementa 1 primeiro e imprime 2 depois
    }
}
