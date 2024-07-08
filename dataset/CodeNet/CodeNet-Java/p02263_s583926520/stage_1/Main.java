
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static boolean isNumber(String s) {
		try {
var newVariable_0 = Long.parseLong(s);			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
var newVariable_1 = sc.hasNext();		while (newVariable_1) {
			String s = sc.next();
			if(isNumber(s)) {
				long a = Long.parseLong(s);
var newVariable_2 = list.add(a);var newVariable_3 = s.equals("+");			} else if(newVariable_3) {
var newVariable_4 = list.get(list.size() - 2);var newVariable_5 = list.size();var newVariable_6 = list.get(list.size() - 1);var newVariable_7 = list.size();				long b = list.get(newVariable_7 - 2) + list.get(newVariable_7 - 1);
var newVariable_8 = list.remove(list.size() - 1);var newVariable_9 = list.size();				list.remove(newVariable_9 - 1);
var newVariable_10 = list.set(list.size() - 1, b);var newVariable_11 = list.size();				list.set(newVariable_11 - 1, b);
var newVariable_12 = s.equals("-");			} else if(newVariable_12) {
var newVariable_13 = list.get(list.size() - 2);var newVariable_14 = list.size();var newVariable_15 = list.get(list.size() - 1);var newVariable_16 = list.size();				long b = list.get(newVariable_16 - 2) - list.get(newVariable_16 - 1);
var newVariable_17 = list.remove(list.size() - 1);var newVariable_18 = list.size();				list.remove(newVariable_18 - 1);
var newVariable_19 = list.set(list.size() - 1, b);var newVariable_20 = list.size();				list.set(newVariable_20 - 1, b);
			} else {
var newVariable_21 = list.get(list.size() - 2);var newVariable_22 = list.size();var newVariable_23 = list.get(list.size() - 1);var newVariable_24 = list.size();				long b = list.get(newVariable_24 - 2) * list.get(newVariable_24 - 1);
var newVariable_25 = list.remove(list.size() - 1);var newVariable_26 = list.size();				list.remove(newVariable_26 - 1);
var newVariable_27 = list.set(list.size() - 1, b);var newVariable_28 = list.size();				list.set(newVariable_28 - 1, b);
			}
		}
		System.out.println(list.get(0));
		sc.close();
	}

}

