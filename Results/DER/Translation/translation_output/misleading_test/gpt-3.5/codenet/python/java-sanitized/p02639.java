import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xList = new int[5];

        for (int i = 0; i < 5; i++) {
            xList[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}