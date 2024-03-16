import java.util.Scanner;

public class p00388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int c = 0; c <= b - a; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}