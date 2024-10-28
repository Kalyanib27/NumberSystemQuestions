import java.util.*;
class UniqueDigit2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		HashSet<Integer> set=new HashSet<>();

		while(n!=0){
			int d=n%10;
			set.add(d);
			n=n/10;
		}
		System.out.print("Unique digits: ");
        for (int d:set) {
            System.out.print(d + " ");
        }
	}
}