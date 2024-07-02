import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
System.out.println("[INST]12;input;sc.next();"+input);
		
		boolean flag = input.length() >= 6 && input.matches(".*[a-z]+.*") && input.matches(".*[A-Z]+.*") && input.matches(".*[0-9]+.*");
System.out.println("[INST]14;None;input.length();"+input.length());
System.out.println("[INST]14;None;input.matches('.*[a-z]+.*');"+input.matches(".*[a-z]+.*"));
System.out.println("[INST]14;None;input.matches('.*[A-Z]+.*');"+input.matches(".*[A-Z]+.*"));
System.out.println("[INST]14;None;input.matches('.*[0-9]+.*');"+input.matches(".*[0-9]+.*"));
		
		System.out.println(flag ? "VALID" : "INVALID");
	}

}