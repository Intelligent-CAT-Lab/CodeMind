import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
		HashSet<Character> set = new HashSet<>();
		//使っている文字をsetに追加
		for (char c : s.toCharArray()) {
System.out.println("[INST]9;None;s.toCharArray();"+s.toCharArray());
			set.add(c);
System.out.println("[INST]10;None;set.add(c);"+set.add(c));
		}

		if (s.length() != 26) {
System.out.println("[INST]13;None;s.length();"+s.length());
			for (char c = 'a'; c <= 'z'; c++) {
				if (set.contains(c)) {
System.out.println("[INST]15;None;set.contains(c);"+set.contains(c));
					continue;
				} else {
					System.out.println(s + c);
					return;
				}
			}
		}

		for (int i = s.length() - 1; i > 0; i--) {
System.out.println("[INST]24;None;s.length();"+s.length());
			String cutted = s.substring(i);//後ろから切り取っていく、cuttedは切り取られた文字列
System.out.println("[INST]25;cutted;s.substring(i);"+cutted);
			String base = s.substring(0, i - 1);//切り取られて残った文字列の末尾を取ったもの
System.out.println("[INST]26;base;s.substring(0, i - 1);"+base);
			//切り取った部分をsetから削除
			for (char c : cutted.toCharArray()) {
System.out.println("[INST]28;None;cutted.toCharArray();"+cutted.toCharArray());
				set.remove(c);
System.out.println("[INST]29;None;set.remove(c);"+set.remove(c));
			}

			for (char c = s.charAt(i - 1); c <= 'z'; c++) {
System.out.println("[INST]32;c;s.charAt(i - 1);"+c);
				if (set.contains(c)) {
System.out.println("[INST]33;None;set.contains(c);"+set.contains(c));
					continue;
				} else {
					System.out.println(base + c);
					return;
				}
			}
			//切り取った部分をsetに追加し直す
			for (char c : cutted.toCharArray()) {
System.out.println("[INST]41;None;cutted.toCharArray();"+cutted.toCharArray());
				set.add(c);
System.out.println("[INST]42;None;set.add(c);"+set.add(c));
			}
		}
		System.out.println(-1);
	}
}