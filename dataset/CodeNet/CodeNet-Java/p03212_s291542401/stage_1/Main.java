import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
var newVariable_0 = Math.log10(N);		int digit = ((int) newVariable_0) + 1;
		List<Long> s = sevenfivethree(digit);
var newVariable_1 = s.isEmpty();		if(newVariable_1) {
			System.out.println(0);
			return;
		}

		int ans = 0;
var newVariable_2 = s.size();		for(int i=0;i<newVariable_2;i++) {
//			System.out.println(s.get(i) + ":" + ans);
var newVariable_3 = s.get(i);			if(newVariable_3 > N) {
				System.out.println(ans);
				return;
			}else {
				ans++;
			}
		}
		System.out.println(ans);
	}

	public static List<Long> sevenfivethree(int N) {
		List<String> s = new ArrayList<>();

		for(int i=N;i>=3;i--) {
			s.addAll(semisevenfivethree(i, ""));
		}

		List<Long> t = new ArrayList<>();

var newVariable_4 = s.size();		for(int i=0;i<newVariable_4;i++) {
			String temp = s.get(i);
var newVariable_5 = temp.contains("3");var newVariable_6 = temp.contains("5");var newVariable_7 = temp.contains("7");			if(temp.contains("3") && temp.contains("5") && newVariable_7) {
var newVariable_8 = t.add(Long.parseLong(temp));var newVariable_9 = Long.parseLong(temp);				t.add(newVariable_9);
//				System.out.println(temp);
			}
		}
		Collections.sort(t);
		return t;
	}

	public static List<String> semisevenfivethree(int N,String a) {

		List<String> s = new ArrayList<>();
		if(N == 0) {
var newVariable_10 = s.add(a);			return s;
		}

		List<String> temp = new ArrayList<>();
		temp.addAll(semisevenfivethree(N-1,a+"3"));
		temp.addAll(semisevenfivethree(N-1,a+"5"));
		temp.addAll(semisevenfivethree(N-1,a+"7"));

var newVariable_11 = s.addAll(temp);		return s;
	}
}
