import java.util.Scanner;
class EvenOddsum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sumeven=0,sumodd=0;
		int d;

		while(n!=0){
			d=n%10;
			if(d%2==0){
				sumeven+=d;
				
			}
			else{
				sumodd+=d;
			}
			n=n/10;
		}
		int diff=sumeven-sumodd;
		System.out.println(diff);

	}
}