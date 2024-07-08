import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

var newVariable_0 = sc.hasNext();		while (newVariable_0) {
var newVariable_1 = sc.hasNextInt();			if (newVariable_1) {
var newVariable_2 = num.add(sc.nextInt());var newVariable_3 = sc.nextInt();				num.add(newVariable_3);
			} else {
				if (system == 0)
var newVariable_4 = param.add(sc.next());var newVariable_5 = sc.next();					param.add(newVariable_5);
				if (system == 1)
var newVariable_6 = param.add(sc.nextLine());var newVariable_7 = sc.nextLine();					param.add(newVariable_7);
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		Collections.sort(num);
		
		System.out.println(num.get(0)+num.get(1));
	}
}