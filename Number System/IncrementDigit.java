import java.util.Scanner;
class IncrementDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int d,mul=1,sum=0;

		while(n!=0){
			d=n%10;
			d=d+1;
			sum=sum+d*mul;
			mul*=10;
			n=n/10;
		}
		System.out.println(sum);

	}
}