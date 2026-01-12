package academy.devdojo.maratona.java;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrInt = new int[3][];
        arrInt[0] = new int[2];
        arrInt[1] = new int[4];
        arrInt[2] = new int[6];

        for (int[] arrBase : arrInt) {
            for (int num : arrBase) {
                System.out.print(num+" ");
            }
        System.out.println();
        }
    }
}
