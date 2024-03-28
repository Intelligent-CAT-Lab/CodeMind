import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] x = input.split(" ");
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(x[i]);
        }
        int a = x[0];
        int b = x[1];
        int min = Integer.MAX_VALUE;
        for (int i = 2; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println(min + "  â ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}