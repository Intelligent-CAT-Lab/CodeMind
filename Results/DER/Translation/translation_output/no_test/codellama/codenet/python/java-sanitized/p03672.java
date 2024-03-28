import java.util.Scanner;

public class p03672 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = scanner.nextInt();

        int[] range = new int[a - b];
        for (int j = 0; j < range.length; j++) {
            range[j] = b + j * i;
        }

        for (int j = 0; j < range.length; j++) {
            System.out.print(range[j] + " ");
        }
    }
}