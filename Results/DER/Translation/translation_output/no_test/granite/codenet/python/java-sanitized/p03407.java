import java.util.Scanner;

public class p03407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}