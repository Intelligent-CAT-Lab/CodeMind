import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);
        int c = Integer.parseInt(inputs[3]);

        System.out.println(n - (c + a - c + b - c));

        scanner.close();
    }
}