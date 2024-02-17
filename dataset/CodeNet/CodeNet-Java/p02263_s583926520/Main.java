
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static boolean isNumber(String s) {
		try {
			Long.parseLong(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
		while (sc.hasNext()) {
			String s = sc.next();
			if(isNumber(s)) {
				long a = Long.parseLong(s);
				list.add(a);
			} else if(s.equals("+")) {
				long b = list.get(list.size() - 2) + list.get(list.size() - 1);
				list.remove(list.size() - 1);
				list.set(list.size() - 1, b);
			} else if(s.equals("-")) {
				long b = list.get(list.size() - 2) - list.get(list.size() - 1);
				list.remove(list.size() - 1);
				list.set(list.size() - 1, b);
			} else {
				long b = list.get(list.size() - 2) * list.get(list.size() - 1);
				list.remove(list.size() - 1);
				list.set(list.size() - 1, b);
			}
		}
		System.out.println(list.get(0));
		sc.close();
	}

}

