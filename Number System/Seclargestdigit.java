import java.util.Scanner;
class Seclargestdigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int largest = 0, secLargest = 0;
        
        while (n != 0) {
            int d= n % 10;
            if (d > largest) {
                secLargest = largest;
                largest = d;
            } else if (d > secLargest && d != largest) {
                secLargest = d;
            }
            n /= 10;
        }
        
        if (secLargest == 0) {
            System.out.println("No second largest digit found.");
        } else {
            System.out.println("Second largest digit: " + secLargest);
        }
	}
}