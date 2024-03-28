import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] x = input.split(" ");
        int a = Integer.parseInt(x[0]);
        int b = Integer.parseInt(x[1]);
        int min = Integer.MIN_VALUE;
        for (int i = 2; i < x.length; i++) {
            int temp = Integer.parseInt(x[i]);
            if (temp < min) {
                min = temp;
            }
        }
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}