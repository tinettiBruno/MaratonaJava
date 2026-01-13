package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Rogisvaldo";
        estudante01.age = 33;
        estudante01.gender = 'M';

        estudante02.name = "Gislaine";
        estudante02.age = 35;
        estudante02.gender = 'F';

        estudante01.print();
        System.out.println();
        estudante02.print();
    }
}
