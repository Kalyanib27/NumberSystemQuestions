import java.util.Scanner;
class SumPrime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int d,sum=0;
		while(n!=0){
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
	
		boolean isprime=true;

		for(int i=2;i<=Math.sqrt(sum);i++){
			if(sum%i==0){
				isprime=false;
				break;
				}
				
			}
			if(isprime){
				System.out.print("Primeno");
			}
			else{
				System.out.print("Not Primeno");
			}

		
	}
}