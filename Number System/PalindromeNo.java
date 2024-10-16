import java.util.Scanner;
class PalindromeNo{

	public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number");
          int n=sc.nextInt();
          int rev=0,d;
          int temp=n;

          while(n!=0){
          	d=n%10;
          	rev=rev*10+d;
          	n=n/10;
          }
          n=temp;

          if(rev==n){
          System.out.println("Number is Palindrome");
          }
          else{
            System.out.println("Number is not Palindrome");
          }
	}
}