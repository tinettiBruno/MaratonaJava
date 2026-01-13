package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Jiraya");
        pessoa.setAge(-70);
        pessoa.print();

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
