import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int X = Integer.parseInt(inputs[0]);
        int Y = Integer.parseInt(inputs[1]);
        int Z = Integer.parseInt(inputs[2]);

        int A = X;
        int B = Y;
        int C = Z;

        B = X;
        C = Y;
        A = Z;

        System.out.println(A + " " + B + " " + C);
    }
}