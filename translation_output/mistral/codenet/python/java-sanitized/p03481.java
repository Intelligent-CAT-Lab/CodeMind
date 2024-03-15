import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[2];
        for (int i = 0; i < 2; i++) {
            n[i] = scanner.nextInt();
        }
        int X = n[0];
        int Y = n[1];

        int k = (Y / X) / (1 << (Integer.bitCount(Y / X)));
        System.out.println(k);
    }
}