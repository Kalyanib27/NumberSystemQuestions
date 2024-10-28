import java.util.Scanner;
class Primeno2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();

		boolean isprime=true;
		if(n==1){
			isprime=false;
		}

		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				isprime=false;
			}
		}
		if(isprime){
			System.out.println("Prime no");
		}
		else{
			System.out.println("Not Prime no");
		}
	}
}