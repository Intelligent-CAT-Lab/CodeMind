import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        int[] a= new int[26];
        int sum=0;
        for(int i=0; i<s.length(); i++) {
System.out.println("[INST]8;None;s.length();"+s.length());
        	a[s.charAt(i)-'a']++;
System.out.println("[INST]9;None;s.charAt(i);"+s.charAt(i));
        }
        for(int i=0; i<26; i++) {
        	sum+=a[i]%2;
        }//各文字2ずつ入ってれば良いから1つしかない文字をカウント
        System.out.println(sum/2);//cpcみたいなの以外は各文字2つになるようにする。
	}
}
