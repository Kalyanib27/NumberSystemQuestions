import java.util.Scanner;
class Product{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.print("Enter a number to be divided: ");
		int m=sc.nextInt();
		int mul=1;

		while(n!=0){
			int d=n%10;
			mul=mul*d;
			n=n/10;

		}
		if(mul%m==0){
		System.out.println("It is divisible");
	   }
	   else{
	   	System.out.println("It is not divisible");
	   }
	}
}