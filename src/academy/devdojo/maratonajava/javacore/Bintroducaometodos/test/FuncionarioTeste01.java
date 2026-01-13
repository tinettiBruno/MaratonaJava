package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.name = "Fabrício";
        funcionario.age = 19;
        funcionario.salaries = new double[]{1300, 1500, 1800};

        funcionario.printData();
//        funcionario.average();
    }
}
