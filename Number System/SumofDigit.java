import java.util.Scanner;
class SumofDigit{

	public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the digit");
          int n=sc.nextInt();
          int sum=0,d;

          while(n!=0){
          	d=n%10;
          	sum+=d;
          	n=n/10;
          }
          System.out.println("Sum of Digit is "+sum);

	}
}