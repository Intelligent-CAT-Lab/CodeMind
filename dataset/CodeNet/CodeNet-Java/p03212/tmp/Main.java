import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String> ();
		long N = sc.nextInt();
System.out.println("[INST]13;N;sc.nextInt();"+N);
		Main main = new Main();
		Queue<String> queue = new ArrayDeque<String>();
		int count =0;
		char ch[] = {'3','5','7'};
		queue.add("357");
System.out.println("[INST]18;None;queue.add('357');"+queue.add("357"));
		queue.add("375");
System.out.println("[INST]19;None;queue.add('375');"+queue.add("375"));
		queue.add("537");
System.out.println("[INST]20;None;queue.add('537');"+queue.add("537"));
		queue.add("573");
System.out.println("[INST]21;None;queue.add('573');"+queue.add("573"));
		queue.add("735");
System.out.println("[INST]22;None;queue.add('735');"+queue.add("735"));
		queue.add("753");
System.out.println("[INST]23;None;queue.add('753');"+queue.add("753"));
		if (N<1000) {
			for (String s:queue) {
				if (Long.parseLong(s)<=N) {
System.out.println("[INST]26;None;Long.parseLong(s);"+Long.parseLong(s));
					count ++;
				}
			}
			System.out.println(count);
			return ;
		}
		while(queue.size()>0) {
System.out.println("[INST]33;None;queue.size();"+queue.size());
			String s = queue.poll();
System.out.println("[INST]34;s;queue.poll();"+s);
			if (Long.parseLong(s)<=N) {
System.out.println("[INST]35;None;Long.parseLong(s);"+Long.parseLong(s));
				count ++;
				for (int i=0;i<=s.length();i++) {
System.out.println("[INST]37;None;s.length();"+s.length());
					for (int j=0;j<ch.length;j++) {
						String temp=main.addChar(s, i, ch[j]);
						if(set.contains(temp)==false) {
System.out.println("[INST]40;None;set.contains(temp);"+set.contains(temp));
							set.add(temp);
System.out.println("[INST]41;None;set.add(temp);"+set.add(temp));
							queue.add(temp);
System.out.println("[INST]42;None;queue.add(temp);"+queue.add(temp));
						}
					}
				}
			}
		}
		System.out.println(count);
  	}

	private String addChar(String s,int location,char c) {
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(0,location));
System.out.println("[INST]53;None;sb.append(s.substring(0,location));"+sb.append(s.substring(0,location)));
System.out.println("[INST]53;None;s.substring(0,location);"+s.substring(0,location));
		sb.append(c);
System.out.println("[INST]54;None;sb.append(c);"+sb.append(c));
		if (location<s.length()) {
System.out.println("[INST]55;None;s.length();"+s.length());
			sb.append(s.substring(location));
System.out.println("[INST]56;None;sb.append(s.substring(location));"+sb.append(s.substring(location)));
System.out.println("[INST]56;None;s.substring(location);"+s.substring(location));
		}
		return sb.toString();
System.out.println("[INST]58;None;sb.toString();"+sb.toString());
	}
}