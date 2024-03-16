import java.util.Scanner;

public class p03547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        System.out.print("Enter N and M: ");
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        if (N > M) {
            System.out.print(">");
        } else if (N == M) {
            System.out.print("=");
        } else {
            System.out.print("<");
        }
    }
}