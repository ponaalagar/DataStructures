/*
age 0 - 12 = child
age 13 - 19 = teenager
age 20 - 59 = adult
age 60+ = senior
*/
import java.util.Scanner;
class Condition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        String category;

        if (age >= 0 && age <= 12) {
            category = "child";
        } else if (age >= 13 && age <= 19) {
            category = "teenager";
        } else if (age >= 20 && age <= 59) {
            category = "adult";
        } else if (age >= 60) {
            category = "senior";

        } else {
            category = "invalid age";
        }

        System.out.println("Age: " + age + ", Category: " + category);
    }
}