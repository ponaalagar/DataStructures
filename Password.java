import java.util.*;

class Password{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter pass: ");
        String pass = sc.nextLine();
        if(pass.length()<8)
        {
            System.out.println("Password must be at least 8 characters long.");
            return;
        }else{
            int uc = 0;
            int lc = 0;
            int num = 0;
            int sp = 0;
            for(int i = 0; i < pass.length(); i++)
            {
                char ch = pass.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    uc++;
                }else if(Character.isLowerCase(ch))
                {   
                    lc++;
                }else if(Character.isDigit(ch))
                {
                    num++;
                }else if(!Character.isLetterOrDigit(ch))
                {
                    sp++;       
                }
            }
            if(uc > 0 && lc > 0 && num > 0 && sp > 0)
            {
                System.out.println("Valid Password");
            }else{
                System.out.println("Invalid Password. It must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            }
        }
    }
}