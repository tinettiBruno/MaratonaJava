package academy.devdojo.maratonajava.introducao;

public class Aula05SwitchCaseExercício {
    /* Dados valores de 1 à 7, imprima se é dia útil ou final de semana *Utilizando switch-case
       Considere 1 como domingo */
    public static void main(String[] args) {
        byte numericDay = 1;
        switch (numericDay) {
            case 1:
                System.out.println("Fim de semana");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Dia útil");
        }
//        if (numericDay == 1 || numericDay == 7) {
//            System.out.println("Fim de semana");
//        } else {
//            System.out.println("Dia útil");
//        }
    }
}
