import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int X = Integer.parseInt(tokens[0]);
        int Y = Integer.parseInt(tokens[1]);
        int Z = Integer.parseInt(tokens[2]);

        int A = X;
        int B = Y;
        int C = Z;

        B = X;
        C = Y;
        A = Z;

        System.out.println(A + " " + B + " " + C);
    }
}