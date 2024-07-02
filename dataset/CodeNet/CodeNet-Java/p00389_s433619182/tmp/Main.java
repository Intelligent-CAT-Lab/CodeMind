import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
System.out.println("[INST]5;count;sc.nextInt();"+count);
		int strength = sc.nextInt();
System.out.println("[INST]6;strength;sc.nextInt();"+strength);
		int total = 1;
		int size = 1;
		count--;
		while (true) {
		    int x = (total + strength - 1) / strength;
		    if (count >= x) {
		        size++;
		        total += x;
		        count -= x;
		    } else {
		        break;
		    }
		}
		System.out.println(size);
	}
}

