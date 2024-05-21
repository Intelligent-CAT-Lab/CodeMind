import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            int num = Integer.parseInt(input[i]) - 1;
            a[num]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        if (c == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}