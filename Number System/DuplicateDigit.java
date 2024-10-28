import java.util.Scanner;
class DuplicateDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int digitcount[]=new int[256];

		while(n!=0){
			int d=n%10;
			digitcount[d]++;
			n=n/10;
			}
		System.out.println("Duplicate digits are");
		for(int i=0;i<10;i++){
			if(digitcount[i]>1)
			System.out.println(i+" ");
		}
	}
}