import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
System.out.println("[INST]11;None;sc.hasNext();"+sc.hasNext());
			if (sc.hasNextInt()) {
System.out.println("[INST]12;None;sc.hasNextInt();"+sc.hasNextInt());
				num.add(sc.nextInt());
System.out.println("[INST]13;None;num.add(sc.nextInt());"+num.add(sc.nextInt()));
System.out.println("[INST]13;None;sc.nextInt();"+sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
System.out.println("[INST]16;None;param.add(sc.next());"+param.add(sc.next()));
System.out.println("[INST]16;None;sc.next();"+sc.next());
				if (system == 1)
					param.add(sc.nextLine());
System.out.println("[INST]18;None;param.add(sc.nextLine());"+param.add(sc.nextLine()));
System.out.println("[INST]18;None;sc.nextLine();"+sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		Collections.sort(num);
System.out.println("[INST]25;None;Collections.sort(num);"+Collections.sort(num));
		
		System.out.println(num.get(0)+num.get(1));
	}
}