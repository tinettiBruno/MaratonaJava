package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries == null) {
            return;
        }
        for(double salary : salaries)
            System.out.print(salary+" ");
        System.out.print("\n");
        printAverage();
    }

    public void printAverage() {
        if (salaries == null) {
            return;
        }
        for(double salary : salaries)
            this.average += salary;
        this.average /= salaries.length;
        System.out.println("The average is: "+average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }
}
