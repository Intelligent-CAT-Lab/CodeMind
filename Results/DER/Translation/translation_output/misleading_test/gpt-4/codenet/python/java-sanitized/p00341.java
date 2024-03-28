import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] a = new int[100];
        int[] b = new int[inputs.length];

        for (int i = 0; i < inputs.length; i++) {
            b[i] = Integer.parseInt(inputs[i]);
            a[b[i] - 1]++;
        }

        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }

        System.out.println(c == 3 ? "yes" : "no");
        scanner.close();
    }
}