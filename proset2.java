package pro;

import java.util.Scanner;

public class proset2 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int k=in.nextInt();
	int t=(int)Math.log10(number);
	int[] arr=new int[t+1];
	int c=0;
	for(int i=number;i>0;i=i/10){
		int r=i%10;
		arr[c]=r;
		c++;
	}
	for(int i=0;i<=t;i++){
		for(int j=i;j<=t;j++){
		if(arr[i]>arr[j]){
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		}
	}
		if(t>k){
		int p=t-k;
		for(int i=0;i<=p;i++){
			System.out.print(arr[i]);
		}
		}
		else if(t==k){
			System.out.println("no array elements to display");
		}
		else{
			System.out.println("invalid input");
	}
	
}
}
