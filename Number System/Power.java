import java.util.*;
class Power{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int d,m,s;
		int sum=0;

		
		while(n!=0){
			d=n%10;
			m=n%100; 
			s=m/10;
			sum=sum+(int) Math.pow(d,s);
			n=n/10;
		}

		System.out.println(sum);

	}
}