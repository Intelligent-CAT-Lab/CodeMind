import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        if (a + b + c == 17 && a == 5 && b == 5 && c == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}