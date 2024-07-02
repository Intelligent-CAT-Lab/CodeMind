import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
System.out.println("[INST]15;pps;System.getProperties();"+pps);
	static boolean dbg = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ni();
	
		List<String> l=new ArrayList<String>();
		solve(a,l);
		System.out.println(l.size());
		for(String str:l)
			out(str);
		
	}



	private static void solve(int a,List<String> l) {
		// TODO Auto-generated method stub
		
		if(a%2==0) {
			for(int i=1;i<=a/2;i++) {
				for(int j=i+1;j<=a/2;j++) {
					l.add(i+" "+j);
System.out.println("[INST]38;None;l.add(i+' '+j);"+l.add(i+" "+j));
					l.add(i+" "+(a+1-j));
System.out.println("[INST]39;None;l.add(i+' '+(a+1-j));"+l.add(i+" "+(a+1-j)));
					l.add((a+1-i)+" "+j);
System.out.println("[INST]40;None;l.add((a+1-i)+' '+j);"+l.add((a+1-i)+" "+j));
					l.add((a+1-i)+" "+(a+1-j));
System.out.println("[INST]41;None;l.add((a+1-i)+' '+(a+1-j));"+l.add((a+1-i)+" "+(a+1-j)));
				}
			}
		}
		else {
			solve(a-1, l);
			for(int i=1;i<a;i++) {
				l.add(a+" "+i);
System.out.println("[INST]48;None;l.add(a+' '+i);"+l.add(a+" "+i));
			}
		}
		
	}



	private static void out(List<Integer> l) {
		// TODO Auto-generated method stub
		for (int i : l)
			System.out.println(i);

	}

	private static void out(int[] b) {
		// TODO Auto-generated method stub
		for (int i : b)
			System.out.println(i);

	}

	public static void out(String str) {

		if (dbg)
			System.out.println(str);
	}

	public static void out(int str) {

		if (dbg)
			System.out.println(str);
	}

	public static int ni() {

		return sc.nextInt();
System.out.println("[INST]84;None;sc.nextInt();"+sc.nextInt());

	}

	public static String ns() {

		return sc.nextLine();
System.out.println("[INST]90;None;sc.nextLine();"+sc.nextLine());
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();
System.out.println("[INST]96;None;sc.nextInt();"+sc.nextInt());
		sc.nextLine();
System.out.println("[INST]97;None;sc.nextLine();"+sc.nextLine());
		return res;
	}

	public static String[] ns(int k) {
		String[] res = new String[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextLine();
System.out.println("[INST]104;None;sc.nextLine();"+sc.nextLine());
		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
System.out.println("[INST]112;None;sc.nextInt();"+sc.nextInt());
		sc.nextLine();
System.out.println("[INST]113;None;sc.nextLine();"+sc.nextLine());
		return res;
	}
}
