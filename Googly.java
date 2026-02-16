import java.util.Scanner;

class Googly{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
int val = sc.nextInt();

int sum = SumOfDigits(val);
if(isprime(sum)){
System.out.println("Googly");
}else{
System.out.println("Not Googly");
}}

public static int SumOfDigits(int val){
int s = 0;
while(val>0)
{
s += val%10;
val = val/10;
}
return s;
}

public static boolean isprime( int val){

for(int i=2;i<val/2;i++){
if(val%i == 0){
return false;
}
}
return true;
}

}
