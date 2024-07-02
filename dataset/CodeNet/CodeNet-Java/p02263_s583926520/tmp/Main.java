
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static boolean isNumber(String s) {
		try {
			Long.parseLong(s);
System.out.println("[INST]10;None;Long.parseLong(s);"+Long.parseLong(s));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
		while (sc.hasNext()) {
System.out.println("[INST]19;None;sc.hasNext();"+sc.hasNext());
			String s = sc.next();
System.out.println("[INST]20;s;sc.next();"+s);
			if(isNumber(s)) {
				long a = Long.parseLong(s);
System.out.println("[INST]22;a;Long.parseLong(s);"+a);
				list.add(a);
System.out.println("[INST]23;None;list.add(a);"+list.add(a));
			} else if(s.equals("+")) {
System.out.println("[INST]24;None;s.equals('+');"+s.equals("+"));
				long b = list.get(list.size() - 2) + list.get(list.size() - 1);
System.out.println("[INST]25;None;list.get(list.size() - 2);"+list.get(list.size() - 2));
System.out.println("[INST]25;None;list.size();"+list.size());
System.out.println("[INST]25;None;list.get(list.size() - 1);"+list.get(list.size() - 1));
System.out.println("[INST]25;None;list.size();"+list.size());
				list.remove(list.size() - 1);
System.out.println("[INST]26;None;list.remove(list.size() - 1);"+list.remove(list.size() - 1));
System.out.println("[INST]26;None;list.size();"+list.size());
				list.set(list.size() - 1, b);
System.out.println("[INST]27;None;list.set(list.size() - 1, b);"+list.set(list.size() - 1, b));
System.out.println("[INST]27;None;list.size();"+list.size());
			} else if(s.equals("-")) {
System.out.println("[INST]28;None;s.equals('-');"+s.equals("-"));
				long b = list.get(list.size() - 2) - list.get(list.size() - 1);
System.out.println("[INST]29;None;list.get(list.size() - 2);"+list.get(list.size() - 2));
System.out.println("[INST]29;None;list.size();"+list.size());
System.out.println("[INST]29;None;list.get(list.size() - 1);"+list.get(list.size() - 1));
System.out.println("[INST]29;None;list.size();"+list.size());
				list.remove(list.size() - 1);
System.out.println("[INST]30;None;list.remove(list.size() - 1);"+list.remove(list.size() - 1));
System.out.println("[INST]30;None;list.size();"+list.size());
				list.set(list.size() - 1, b);
System.out.println("[INST]31;None;list.set(list.size() - 1, b);"+list.set(list.size() - 1, b));
System.out.println("[INST]31;None;list.size();"+list.size());
			} else {
				long b = list.get(list.size() - 2) * list.get(list.size() - 1);
System.out.println("[INST]33;None;list.get(list.size() - 2);"+list.get(list.size() - 2));
System.out.println("[INST]33;None;list.size();"+list.size());
System.out.println("[INST]33;None;list.get(list.size() - 1);"+list.get(list.size() - 1));
System.out.println("[INST]33;None;list.size();"+list.size());
				list.remove(list.size() - 1);
System.out.println("[INST]34;None;list.remove(list.size() - 1);"+list.remove(list.size() - 1));
System.out.println("[INST]34;None;list.size();"+list.size());
				list.set(list.size() - 1, b);
System.out.println("[INST]35;None;list.set(list.size() - 1, b);"+list.set(list.size() - 1, b));
System.out.println("[INST]35;None;list.size();"+list.size());
			}
		}
		System.out.println(list.get(0));
		sc.close();
	}

}

