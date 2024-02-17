import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new HashSet<>();
		//使っている文字をsetに追加
		for (char c : s.toCharArray()) {
			set.add(c);
		}

		if (s.length() != 26) {
			for (char c = 'a'; c <= 'z'; c++) {
				if (set.contains(c)) {
					continue;
				} else {
					System.out.println(s + c);
					return;
				}
			}
		}

		for (int i = s.length() - 1; i > 0; i--) {
			String cutted = s.substring(i);//後ろから切り取っていく、cuttedは切り取られた文字列
			String base = s.substring(0, i - 1);//切り取られて残った文字列の末尾を取ったもの
			//切り取った部分をsetから削除
			for (char c : cutted.toCharArray()) {
				set.remove(c);
			}

			for (char c = s.charAt(i - 1); c <= 'z'; c++) {
				if (set.contains(c)) {
					continue;
				} else {
					System.out.println(base + c);
					return;
				}
			}
			//切り取った部分をsetに追加し直す
			for (char c : cutted.toCharArray()) {
				set.add(c);
			}
		}
		System.out.println(-1);
	}
}