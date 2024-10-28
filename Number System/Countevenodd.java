import java.util.Scanner;
class Countevenodd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d;
		int counteven=0,countodd=0;
		
		while(n!=0){
			d=n%10;
			if(d%2==0){
				counteven++;
			}else{
				countodd++;
			}
			n=n/10;
		}

		System.out.println(counteven + " " + countodd);

	}
}