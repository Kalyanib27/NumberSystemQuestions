import java.util.Scanner;
class ReverseNo{

	public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number");
          int n=sc.nextInt();
          int rev=0,d;

          while(n!=0){
          	d=n%10;
          	rev=rev*10+d;
          	n=n/10;
          }
          System.out.println("Reverse Number is "+rev);

	}
}