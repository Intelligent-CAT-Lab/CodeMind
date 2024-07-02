import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
System.out.println("[INST]7;line;sc.nextLine().split(' ');"+line);
System.out.println("[INST]7;None;sc.nextLine();"+sc.nextLine());
		int membersCount = Integer.parseInt(line[0]);
System.out.println("[INST]8;membersCount;Integer.parseInt(line[0]);"+membersCount);
		int trainFee = Integer.parseInt(line[1]);
System.out.println("[INST]9;trainFee;Integer.parseInt(line[1]);"+trainFee);
		int taxiFee = Integer.parseInt(line[2]);
System.out.println("[INST]10;taxiFee;Integer.parseInt(line[2]);"+taxiFee);
		int result = 0;
		if(membersCount*trainFee>=taxiFee) {
			result = taxiFee;
		}else {
			result = membersCount*trainFee;
		}
		System.out.println(result);
		
		
		
		
	}
}