import java.util.Scanner;
class ReplaceDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit");
		int n=sc.nextInt();
		int d;
		System.out.println("Enter digit to replace");
		int i=sc.nextInt();
		System.out.println("Enter replace digit ");
		int r=sc.nextInt();
		int mul=1,result=0;

		while(n!=0){
			d=n%10;
			if(d==i){
				d=r;
			}
			result = d * mul + result;
            mul *= 10;
			n=n/10;
		

		}
		
		System.out.println(result);


	}
}