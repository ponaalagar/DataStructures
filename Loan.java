import java.util.Scanner;

class Loan{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int creditScore;;
        double income,loanAmount,debts;
        
        System.out.print("Enter your credit score: ");
        creditScore = sc.nextInt();
        System.out.print("Enter your income: ");
        income = sc.nextDouble();
        System.out.print("Enter your total debts: ");
        debts = sc.nextDouble();
        System.out.print("Enter the loan amount you want: ");
        loanAmount = sc.nextDouble();

        if(creditScore >= 750 && income > 2*loanAmount && debts < 0.5 * income) {
            System.out.println("approved");
        } else if(creditScore < 650 && income < loanAmount && debts > income) {
            System.out.println("rejected");
        }else {
            System.out.println("Manual review");
        }

    }

}