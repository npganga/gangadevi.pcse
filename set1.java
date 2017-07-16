package player;

import java.util.Scanner;

public class set1 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.next();
	String rev="";
	for(int i=input.length()-1;i>=0;i--){
		rev+=input.charAt(i);
	}
	System.out.println(rev);
	in.close();
}
}
