import java.util.Scanner;
class Fibonacci{

	public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number");
          int n=sc.nextInt();
          
          int a=0,b=1,c=0;

          if(n==1){
            System.out.println(a);
          }
          else{
            System.out.print(a+" "+b+" ");
            for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
          }
          }
          
          
	}
}