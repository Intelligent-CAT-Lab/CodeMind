import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new HashSet<>();
		//使っている文字をsetに追加
var newVariable_0 = s.toCharArray();		for (char c : newVariable_0) {
var newVariable_1 = set.add(c);		}

var newVariable_2 = s.length();		if (newVariable_2 != 26) {
			for (char c = 'a'; c <= 'z'; c++) {
var newVariable_3 = set.contains(c);				if (newVariable_3) {
					continue;
				} else {
					System.out.println(s + c);
					return;
				}
			}
		}

var newVariable_4 = s.length();		for (int i = newVariable_4 - 1; i > 0; i--) {
			String cutted = s.substring(i);//後ろから切り取っていく、cuttedは切り取られた文字列
			String base = s.substring(0, i - 1);//切り取られて残った文字列の末尾を取ったもの
			//切り取った部分をsetから削除
var newVariable_5 = cutted.toCharArray();			for (char c : newVariable_5) {
var newVariable_6 = set.remove(c);			}

			for (char c = s.charAt(i - 1); c <= 'z'; c++) {
var newVariable_7 = set.contains(c);				if (newVariable_7) {
					continue;
				} else {
					System.out.println(base + c);
					return;
				}
			}
			//切り取った部分をsetに追加し直す
var newVariable_8 = cutted.toCharArray();			for (char c : newVariable_8) {
var newVariable_9 = set.add(c);			}
		}
		System.out.println(-1);
	}
}