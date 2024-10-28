import java.util.*;
class RemoveDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit");
		int n=sc.nextInt();
		
		System.out.println("Enter digit to remove");
		int i=sc.nextInt();
		int sum=0,mul=1,d;

		while(n!=0){
			d=n%10;
			if(d!=i){
			sum=sum+d*mul;
			mul=mul*10;
		}
		n=n/10;

		}
		System.out.println(sum);


	}
}