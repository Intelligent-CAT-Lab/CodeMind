import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = sc.nextInt();
        }
        int max = S[0];
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (max < S[i]) {
                max = S[i];
                index = i;
            }
        }
        if (index == 0) {
            System.out.println("A");
        } else if (index == 1) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}