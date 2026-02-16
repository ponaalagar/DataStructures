import java.util.Scanner;
import java.util.*;


class DecToNBase {
    public static char converToChar(int num)
    {
        if(num >=0 && num < 10)
        {
            return (char)('0' + num);
        }else if(num >= 10 && num < 36)
        {
            return (char)('A' + num - 10);
        }
        return '0';

    }

    public static String convertToBase(int dec , int n)
    {
        String result = "";
        while(dec > 0)
        {
            int remainder = dec % n;
            int quotient = dec / n;
            result += converToChar(remainder);
            dec = quotient;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.println("Enter the base (2-36): ");
        int base = sc.nextInt();

        String result = convertToBase(decimalNumber, base);
        System.out.println("Number in base " + base + ": " + result);


    
    }
}