import java.util.Scanner;

public class p03943 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the entire line and splitting it into parts
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        }
        if (a + c == b) {
            ans = "Yes";
        }
        if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);

        scanner.close();
    }
}