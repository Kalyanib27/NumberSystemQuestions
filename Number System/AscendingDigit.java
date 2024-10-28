import java.util.Scanner;
class AscendingDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		char ch[]=s.toCharArray();

		for(int i=0;i<ch.length-1;i++){
			for(int j=0;j<ch.length-1-i;j++){
				if(ch[j]>ch[j+1]){
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
						}
				}
			}
			String s1=new String(ch);
		System.out.println(s1);
		

	}
}