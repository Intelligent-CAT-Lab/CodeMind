import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] i = convStrToInt(s);
		System.out.println( TwoNorThree(i) );


	}

	private static int[] convStrToInt(String s) {
		String[] strs = s.split(" ");
		int[] ints = new int[strs.length];
		int i = 0;

		for (String st : strs) {
			ints[i] = Integer.parseInt(st);
			i++;
		}

		return ints;
	}

	private static int TwoNorThree(int[] i) {
		return i[0] - i[1] - i[2] + i[3];
	}
}

