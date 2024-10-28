import java.util.Scanner;
class LargestDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int largest=0;
		int d;

		while(n!=0){
			d=n%10;
			if(d>largest){
				largest=d;
				
			}
			n=n/10;
		}
		System.out.println(largest);

	}
}