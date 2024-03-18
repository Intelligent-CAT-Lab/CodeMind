import java.util.Scanner;

public class p03672 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int[] lll = new int[(s.length() - 1) / 2];
        int counter = 1;
        for (int i = lll.length - 1; i >= 0; i--) {
            lll[i] = counter;
            counter += 2;
        }
        for (int i : lll) {
            System.err.print("range: ");
            for (int val : lll) {
                System.err.print(val + " ");
            }

            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.println("debug: false this time");
            }
        }
    }
}