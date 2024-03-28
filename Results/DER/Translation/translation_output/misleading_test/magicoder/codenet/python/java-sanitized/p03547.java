import java.util.Scanner;

public class p03547 {
    public static void main(String[] args) {
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String N = input[0];
        String M = input[1];

        if (N.compareTo(M) > 0) {
            System.out.println(">");
        } else if (N.compareTo(M) == 0) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}