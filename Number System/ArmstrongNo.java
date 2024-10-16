import java.util.Scanner;
class ArmstrongNo{

	public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number");
          int n=sc.nextInt();
          
          int count=0,s=0,d;
          int temp=n;

          while(n!=0){

          	count++;
            n=n/10;
          }
          n=temp;

          while(n!=0)
          {
             d=n%10;
             s= s+ (int) Math.pow(d,count);
             n=n/10;
          }
          if(s==temp)
          {
          System.out.println("Armstrong Number");
           }
           else{
           	System.out.println("Not Armstrong Number");
           }
          
	}
}