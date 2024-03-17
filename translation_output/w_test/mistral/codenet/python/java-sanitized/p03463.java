import java.util.Scanner;

public class p03463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String output;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (Math.abs(b - c) % 2 == 0) {
            output = "Alice";
        } else {
            output = "Borys";
        }
        System.out.println(output);
    }
}