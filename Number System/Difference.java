import java.util.Scanner;
class Difference{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int largest=-1,smallest=9;

		while(n!=0){
			int d=n%10;
			if(d>largest){
				largest=d;
			}
			if(d<smallest){
				smallest=d;
			}
			n=n/10;
		}
		int diff=largest-smallest;
		System.out.println(diff);
	}
}