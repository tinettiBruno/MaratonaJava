package academy.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        float annualSalary = 70000;
        float tax = 0;
        System.out.println("Your annual salary is: " + annualSalary+"€");
        if (annualSalary < 0) {
            System.out.println("Tu ta de brincation with me?");
        } else if (annualSalary >= 0 && annualSalary <= 34712) {
            tax = 9.7F;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            tax = 37.35F;
        } else {
            tax = 49.5F;
        }
        System.out.println("The tax you have to pay are: " + tax + "% of "+annualSalary+"€");
        float debt = annualSalary*(tax/100);
        System.out.println("The tax you owe is: "+debt+"€");
    }
}
