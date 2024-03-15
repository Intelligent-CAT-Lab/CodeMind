Solution


import java.util.Scanner;

public class p02910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] odd = {"R", "U", "D"};
		String[] even = {"L", "U", "D"};
		
		for (int i = 0; i < s.length() / 2; i++) {
			if (!odd[i].equals(s.charAt(i))) {
				System.out.println("No");
				System.exit(0);
			}
		}
		
		for (int j = 1; j < s.length() / 2; j++) {
			if (!even[j].equals(s.charAt(j))) {
				System.out.println("No");
				System.exit(0);
			}
		}
		
		System.out.println("Yes");
	}
}