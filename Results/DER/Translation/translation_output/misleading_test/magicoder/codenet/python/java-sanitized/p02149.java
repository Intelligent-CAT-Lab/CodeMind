import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = scanner.nextInt();
        }
        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }
    }
}