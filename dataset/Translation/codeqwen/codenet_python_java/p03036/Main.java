import java.util.Scanner;

public class p03036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int r = Integer.parseInt(inputs[0]);
        int d = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}