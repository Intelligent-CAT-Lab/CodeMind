Solution


import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[4];
        for (int i = 0; i < 4; i++) {
            s[i] = sc.nextInt();
        }
        int[] sorted = new int[4];
        for (int i = 0; i < 4; i++) {
            sorted[i] = s[i];
        }
        Arrays.sort(sorted);
        if (sorted[0] == sorted[1] && sorted[2] == sorted[3] && sorted[0] != sorted[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}