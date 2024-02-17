import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int[] a= new int[26];
        int sum=0;
        for(int i=0; i<s.length(); i++) {
        	a[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++) {
        	sum+=a[i]%2;
        }//各文字2ずつ入ってれば良いから1つしかない文字をカウント
        System.out.println(sum/2);//cpcみたいなの以外は各文字2つになるようにする。
	}
}
