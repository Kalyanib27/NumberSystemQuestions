import java.util.Scanner;
class SumEvenDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int d;

		while(n!=0){
			d=n%10;
			if(d%2==0){
				sum+=d;
				
			}
			n=n/10;
		}
		System.out.println(sum);

	}
}