import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ni = scanner.nextInt();
        int[] nm = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(new int[0]);
        int[] nl = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(new int[0]);

        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }
    }
}