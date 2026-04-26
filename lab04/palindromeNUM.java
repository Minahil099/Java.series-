import java.util.Scanner;
public class palindromeNUM{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");

int num=sc.nextInt();
int orginal=num;
int reverse=0;
while(num!=0){
    int digit=num%10;
    reverse=reverse*10+digit;
    num=num/10;
}
if(orginal==reverse){
    System.out.println("Palindrome number");
}else{
    System.out.println("not palindrome");
}
sc.close();
}
}



