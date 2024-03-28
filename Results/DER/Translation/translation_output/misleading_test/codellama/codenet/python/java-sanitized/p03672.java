import java.util.Scanner;

public class p03672 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int[] lll = new int[s.length() - 2];
        for (int i = 0; i < lll.length; i++) {
            lll[i] = i + 1;
        }
        for (int i : lll) {
            System.out.println("range: " + lll);
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.out.println("debug: false this time");
            }
        }
    }
}