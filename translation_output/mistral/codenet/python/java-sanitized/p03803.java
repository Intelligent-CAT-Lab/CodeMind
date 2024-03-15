import java.util.Scanner;

public class p03803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
        int[] a = new int[2];
        int[] b = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        if (j.indexOf(a[0]) > j.indexOf(a[1])) {
            System.out.println("Alice");
        } else if (j.indexOf(a[0]) < j.indexOf(a[1])) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}