import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = 0;
        int f = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                e++;
            } else if (a.charAt(i) == '-') {
                f++;
            }
        }

        System.out.println(e - f);
    }
}