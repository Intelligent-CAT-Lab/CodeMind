import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
	    int y = sc.nextInt();
System.out.println("[INST]6;y;sc.nextInt();"+y);
	    int z = sc.nextInt();
System.out.println("[INST]7;z;sc.nextInt();"+z);
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}

