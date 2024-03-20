import java.util.Scanner;

public class p03250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String StringA = String.valueOf(a);
		String StringB = String.valueOf(b);
		String StringC = String.valueOf(c);
		
		if (a >= b and a >= c):
			if (b  >= c):
				System.out.println(int(StringA + StringB)+ c);
			else  :
				System.out.println(int(StringA + StringC)+ b);
		elif (b>=a and b >= c):
			if (a>=c):
				System.out.println(int(StringB + StringA) + c);
			else :
				System.out.println(int(StringB + StringC)+a);	
		else:
			if(a>= b):
				System.out.println(int(StringC + StringA)+b);
			else:
				System.out.println(int(StringC + StringB)+a);
		}

	}
}