import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
var newVariable_0 = s.length();		int[] arr = new int[newVariable_0];
var newVariable_1 = s.length();		for (int i = 0; i < newVariable_1; i++) {
var newVariable_2 = s.charAt(i);			arr[i] = newVariable_2 - '0';
		}
		int min = Integer.MAX_VALUE;
var newVariable_3 = s.length();		for (int i = 0; i + 2 < newVariable_3; i++) {
			int value = abc(arr[i], arr[i + 1], arr[i + 2]);
			if (min >= value) {
				min = value;
			}
		}
		System.out.println(min);
		
	}
	
	public static int abc(int a, int b, int c) {
		int value = a * 100 + b * 10 + c;
		value -= 753;
		if (value >= 0) {
			return value;
		} else {
			return value * -1;
		}
	}
	
}