import java.util.*;

class Cipher{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();
        int skipper = sc.nextInt();
        char[] ch = new char[str.length()];
        for(int i = 0; i < str.length(); i++){

            if(Character.isLetter(str.charAt(i))){
            int temp = (int)str.charAt(i);

            if(temp>=(int)'a' && temp<=(int)'z'){
                if(temp+3>(int)'z'){
                    ch[i] = (char)(temp+skipper-(int)'z'+(int)'a'-1);
                }else{
                    ch[i] = (char)(temp+skipper);
                }
            }else if(temp>=(int)'A' && temp<=(int)'Z'){
                if(temp+3>(int)'Z'){
                    ch[i] = (char)(temp+skipper-(int)'Z'+(int)'A'-1);
                }else{
                    ch[i] = (char)(temp+skipper);    
                }
            }
            }
        }
        System.out.println("Ciphered text: " + new String(ch));



    }
}