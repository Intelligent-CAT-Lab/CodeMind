import java.util.Scanner;

public class p03059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int t = Integer.parseInt(inputs[2]);

        System.out.println((t / a) * b);

        scanner.close();
    }
}