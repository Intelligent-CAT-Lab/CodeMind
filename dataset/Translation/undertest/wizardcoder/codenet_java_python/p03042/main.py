import java.util.Scanner;

public class p03042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int yy = S / 100;
		int mm = S % 100;

		if(1 <= yy and yy <= 12) {
			if(1 <= mm and mm <= 12) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(1 <= mm and mm <= 12) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}

	}

}