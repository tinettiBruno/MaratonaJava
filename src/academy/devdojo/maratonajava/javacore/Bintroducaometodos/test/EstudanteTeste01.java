package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.PrintEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        PrintEstudante printEstudante = new PrintEstudante();

        estudante01.name = "Rogisvaldo";
        estudante01.age = 33;
        estudante01.gender = 'M';

        estudante02.name = "Gislaine";
        estudante02.age = 35;
        estudante02.gender = 'F';

        printEstudante.printEstudante(estudante01);
        System.out.println();
        printEstudante.printEstudante(estudante02);
    }
}
