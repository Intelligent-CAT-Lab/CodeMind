import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = {25, 10, 5, 1};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (n != 0) {
                count += n / a[i];
                n %= a[i];
            }
        }
        System.out.println(count);
    }
}

