import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int cnt = 0;
var newVariable_0 = N.substring(0, 1).equals("2");var newVariable_1 = N.substring(0, 1);		if(newVariable_1.equals("2")) cnt++;
var newVariable_2 = N.substring(1, 2).equals("2");var newVariable_3 = N.substring(1, 2);		if(newVariable_3.equals("2")) cnt++;
var newVariable_4 = N.substring(2, 3).equals("2");var newVariable_5 = N.substring(2, 3);		if(newVariable_5.equals("2")) cnt++;
var newVariable_6 = N.substring(3, 4).equals("2");var newVariable_7 = N.substring(3, 4);		if(newVariable_7.equals("2")) cnt++;
		System.out.println(cnt);
	}
}
