import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
System.out.println("[INST]6;s;sc.next();"+s);
		int[] arr = new int[s.length()];
System.out.println("[INST]7;None;s.length();"+s.length());
		for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]8;None;s.length();"+s.length());
			arr[i] = s.charAt(i) - '0';
System.out.println("[INST]9;None;s.charAt(i);"+s.charAt(i));
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i + 2 < s.length(); i++) {
System.out.println("[INST]12;None;s.length();"+s.length());
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