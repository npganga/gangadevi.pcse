package player;

import java.util.Scanner;

public class set3 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int rev=0;
		int q=(int)Math.log10(input);
		for(int i=input;i>0;i=i/10){
		int t=i%10;
		rev=rev+(int)(Math.pow(10,q)*t);
		q--;
		}
		System.out.println(rev);
		in.close();
	}
}
