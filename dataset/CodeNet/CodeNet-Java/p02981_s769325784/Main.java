import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int membersCount = Integer.parseInt(line[0]);
		int trainFee = Integer.parseInt(line[1]);
		int taxiFee = Integer.parseInt(line[2]);
		int result = 0;
		if(membersCount*trainFee>=taxiFee) {
			result = taxiFee;
		}else {
			result = membersCount*trainFee;
		}
		System.out.println(result);
		
		
		
		
	}
}