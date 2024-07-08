

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[45];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		int n = sc.nextInt();
		System.out.println(arr[n]);
	}
}

