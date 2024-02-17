import  java.util.Scanner;

public class Main {
	
	void run(){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int[] c = new int[4];
		for(int i=0;i<s.length;i++) {
			if(s[i]=='K')c[0]++;
			if(s[i]=='U')c[1]++;
			if(s[i]=='P')c[2]++;
			if(s[i]=='C')c[3]++;
		}
		System.out.println(Math.min(c[0], Math.min(c[1], Math.min(c[2], c[3]))));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

