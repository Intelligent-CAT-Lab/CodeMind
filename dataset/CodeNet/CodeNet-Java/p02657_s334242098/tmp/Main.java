import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.lang.Math;
import java.util.HashMap;
public class Main {
	public static int useBs(int[] arr, int targetValue) {	
		int a =  Arrays.binarySearch(arr, targetValue);
System.out.println("[INST]9;a;Arrays.binarySearch(arr, targetValue);"+a);
		if(a >=0 && a<arr.length)
			return a;
		else
			return -1;
	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	static boolean isPalindrome(String s) {
		int l=s.length();
System.out.println("[INST]22;l;s.length();"+l);
		for(int i=0;i<l/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
System.out.println("[INST]25;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]25;None;s.charAt(l-i-1);"+s.charAt(l-i-1));
				return false;
		}
		return true;
	}
	static String revString(String str)
	{
		return new StringBuffer(str).reverse().toString();
System.out.println("[INST]32;None;new StringBuffer(str).reverse().toString();"+new StringBuffer(str).reverse().toString());
System.out.println("[INST]32;None;new StringBuffer(str).reverse();"+new StringBuffer(str).reverse());
	}
	static String sortString(String s) {
		char a[]=s.toCharArray();
System.out.println("[INST]35;a;s.toCharArray();"+a);
		Arrays.sort(a);
System.out.println("[INST]36;None;Arrays.sort(a);"+Arrays.sort(a));
		return new String(a);
	}
	static int sumList(List<Integer>a) {
		return a.stream().mapToInt(Integer::intValue).sum();
System.out.println("[INST]40;None;a.stream().mapToInt(Integer::intValue).sum();"+a.stream().mapToInt(Integer::intValue).sum());
System.out.println("[INST]40;None;a.stream().mapToInt(Integer::intValue);"+a.stream().mapToInt(Integer::intValue));
System.out.println("[INST]40;None;a.stream();"+a.stream());
	}
	static int sumArray(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
    public static void main(String[]args) throws java.lang.Exception{
    	Scanner sc=new Scanner(System.in);
    	int x=sc.nextInt();
System.out.println("[INST]51;x;sc.nextInt();"+x);
    	int n=sc.nextInt();
System.out.println("[INST]52;n;sc.nextInt();"+n);
    	System.out.println(x*n);
    }
}
