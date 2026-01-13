package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] month = new int[3][3];

//        dias[0][0] = 1;
//        System.out.println(dias[0][0]);

        for (int i = 0; i < month.length; i++) {
            for (int j = 0; j < month[i].length; j++) {
                System.out.printf(month[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] week : month) { // foreach solution
            for (int day : week) {
                System.out.printf(day + " ");
            }
            System.out.println();
        }
    }
}
