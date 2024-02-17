import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int digit = ((int) Math.log10(N)) + 1;
		List<Long> s = sevenfivethree(digit);
		if(s.isEmpty()) {
			System.out.println(0);
			return;
		}

		int ans = 0;
		for(int i=0;i<s.size();i++) {
//			System.out.println(s.get(i) + ":" + ans);
			if(s.get(i) > N) {
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

		for(int i=0;i<s.size();i++) {
			String temp = s.get(i);
			if(temp.contains("3") && temp.contains("5") && temp.contains("7")) {
				t.add(Long.parseLong(temp));
//				System.out.println(temp);
			}
		}
		Collections.sort(t);
		return t;
	}

	public static List<String> semisevenfivethree(int N,String a) {

		List<String> s = new ArrayList<>();
		if(N == 0) {
			s.add(a);
			return s;
		}

		List<String> temp = new ArrayList<>();
		temp.addAll(semisevenfivethree(N-1,a+"3"));
		temp.addAll(semisevenfivethree(N-1,a+"5"));
		temp.addAll(semisevenfivethree(N-1,a+"7"));

		s.addAll(temp);
		return s;
	}
}
