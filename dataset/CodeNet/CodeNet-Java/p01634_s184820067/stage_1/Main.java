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
		
var newVariable_0 = input.length();var newVariable_1 = input.matches(".*[a-z]+.*");var newVariable_2 = input.matches(".*[A-Z]+.*");var newVariable_3 = input.matches(".*[0-9]+.*");		boolean flag = input.length() >= 6 && input.matches(".*[a-z]+.*") && input.matches(".*[A-Z]+.*") && newVariable_3;
		
		System.out.println(flag ? "VALID" : "INVALID");
	}

}