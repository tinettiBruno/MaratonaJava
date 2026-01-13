package academy.devdojo.maratonajava.introducao;

public class Aula07Array {
    public static void main(String[] args) {
        /*
            Diferentes tipos de arrays iniciam com diferentes "valores padrões"
            byte, short, int, long, float e double: O
            char: '\u0000'
            boolean: false
            String: null
        */
        int[] idades = new int[3]; // inicializa com 0 em todos os espaços, null caso seja um array de strings
        idades[0] = 23;
        idades[1] = 24;
        idades[2] = 33;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        String[] names = {"Tenente Havoc", "Coronel Hughes", "Tenente-Coronel Mustang"};
        for (String name : names) { // foreach
            System.out.println(name);
        }
    }
}
