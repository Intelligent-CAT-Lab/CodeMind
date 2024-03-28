import java.util.Scanner;

public class p03036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, d, x;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        r = Integer.parseInt(split[0]);
        d = Integer.parseInt(split[1]);
        x = Integer.parseInt(split[2]);

        for (int i = 1; i < 11; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}