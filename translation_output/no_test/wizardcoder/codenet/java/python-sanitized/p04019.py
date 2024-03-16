import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
		for i in range(len(s)):
			if s[i] == 'S':
				checkS = True
			elif s[i] == 'N':
				checkN = True
			elif s[i] == 'W':
				checkW = True
			elif s[i] == 'E':
				checkE = True
		if checkS == checkN and checkW == checkE:
			System.out.println("Yes")
		else:
			System.out.println("No")
	}

}