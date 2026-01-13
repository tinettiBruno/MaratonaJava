package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public short age;
    public double[] salaries;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries == null) {
            return;
        }
        for(double salary : salaries)
            System.out.println(salary);
        average();
    }

    public void average() {
        if (salaries == null) {
            return;
        }
        double sum = 0;
        for(double salary : salaries)
            sum += salary;
        System.out.println("The average is: "+(sum/salaries.length));
    }
}
