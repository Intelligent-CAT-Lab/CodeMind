import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int count = 0;
		for(int x = 0;x <= k;x++) {
			for(int y = 0;y <= k;y++) {
				int z = s - x - y;
				if(z >= 0 && z <= k) count ++;
			}
		}
		System.out.println(count);
	}
}
