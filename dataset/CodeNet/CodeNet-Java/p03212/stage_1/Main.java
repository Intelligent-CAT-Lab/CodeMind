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
		Main main = new Main();
		Queue<String> queue = new ArrayDeque<String>();
		int count =0;
		char ch[] = {'3','5','7'};
var newVariable_0 = queue.add("357");var newVariable_1 = queue.add("375");var newVariable_2 = queue.add("537");var newVariable_3 = queue.add("573");var newVariable_4 = queue.add("735");var newVariable_5 = queue.add("753");		if (N<1000) {
			for (String s:queue) {
var newVariable_6 = Long.parseLong(s);				if (newVariable_6<=N) {
					count ++;
				}
			}
			System.out.println(count);
			return ;
		}
var newVariable_7 = queue.size();		while(newVariable_7>0) {
			String s = queue.poll();
var newVariable_8 = Long.parseLong(s);			if (newVariable_8<=N) {
				count ++;
var newVariable_9 = s.length();				for (int i=0;i<=newVariable_9;i++) {
					for (int j=0;j<ch.length;j++) {
						String temp=main.addChar(s, i, ch[j]);
var newVariable_10 = set.contains(temp);						if(newVariable_10==false) {
var newVariable_11 = set.add(temp);var newVariable_12 = queue.add(temp);						}
					}
				}
			}
		}
		System.out.println(count);
  	}

	private String addChar(String s,int location,char c) {
		StringBuffer sb = new StringBuffer();
var newVariable_13 = sb.append(s.substring(0,location));var newVariable_14 = s.substring(0,location);		sb.append(newVariable_14);
var newVariable_15 = sb.append(c);var newVariable_16 = s.length();		if (location<newVariable_16) {
var newVariable_17 = sb.append(s.substring(location));var newVariable_18 = s.substring(location);			sb.append(newVariable_18);
		}
var newVariable_19 = sb.toString();		return newVariable_19;
	}
}