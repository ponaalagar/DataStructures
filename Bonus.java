import java.util.Scanner;

class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter performance rating (1-5): ");
        int performance = sc.nextInt();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        System.out.print("Enter department (Sales/Other): ");
        String dept = sc.next();
        double bonus = bonus(performance, years, dept);
        System.out.printf("The bonus is: %.2f%%\n", bonus * 100);
    }
    public static double bonus(int performance, int years, String dept)
    {
        double bonus = 0;

        switch(performance)
        {
            case 1: bonus += 0;
                    break;
            case 2: bonus += 0;
                    break;
            case 3: bonus += 0.1 ;
                    break;
            case 4: bonus += 0.15 ;
                    break;
            case 5: bonus += 0.2 ;
                    break;
            default: System.out.println("Invalid performance rating");
                     return 0;
        }

        if(years > 5)
        {
            bonus += 0.05;
        }

        if(dept.equals("Sales"))
        {
            bonus += 0.03;
        }

        return bonus;
    }
}