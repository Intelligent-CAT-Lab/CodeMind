import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
System.out.println("[INST]4;N;sc.next();"+N);
		int cnt = 0;
		if(N.substring(0, 1).equals("2")) cnt++;
System.out.println("[INST]6;None;N.substring(0, 1).equals('2');"+N.substring(0, 1).equals("2"));
System.out.println("[INST]6;None;N.substring(0, 1);"+N.substring(0, 1));
		if(N.substring(1, 2).equals("2")) cnt++;
System.out.println("[INST]7;None;N.substring(1, 2).equals('2');"+N.substring(1, 2).equals("2"));
System.out.println("[INST]7;None;N.substring(1, 2);"+N.substring(1, 2));
		if(N.substring(2, 3).equals("2")) cnt++;
System.out.println("[INST]8;None;N.substring(2, 3).equals('2');"+N.substring(2, 3).equals("2"));
System.out.println("[INST]8;None;N.substring(2, 3);"+N.substring(2, 3));
		if(N.substring(3, 4).equals("2")) cnt++;
System.out.println("[INST]9;None;N.substring(3, 4).equals('2');"+N.substring(3, 4).equals("2"));
System.out.println("[INST]9;None;N.substring(3, 4);"+N.substring(3, 4));
		System.out.println(cnt);
	}
}
