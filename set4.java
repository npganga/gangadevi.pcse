package player;

import java.util.Scanner;

public class set4 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String input=in.next();
	try{
	int output=Integer.valueOf(input);
	System.out.println(output);
	}
	catch (NumberFormatException t){
		System.out.println("invalid");
	}
	//System.out.println(output);
	in.close();
}
}
