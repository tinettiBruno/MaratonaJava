package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Rolando";
        professor.age = 35;
        professor.gender = 'M';
        System.out.println("nome: " + professor.name + " idade: " + professor.age + " sexo: " + professor.gender);
    }
}
