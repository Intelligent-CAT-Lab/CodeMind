import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[370];
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int temp[] = new int[3];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li[ind++] = i;
            }
            if (count == 2) {
                int j = 0;
                while (q != 0) {
                    temp[j++] = q % 10;
                    q /= 10;
                }
                for (int k = 0; k < j; k++) {
                    li[ind++] = temp[k];
                }
            }
            if (count == 3) {
                int j = 0;
                while (q != 0) {
                    temp[j++] = q % 10;
                    q /= 10;
                }
                for (int k = 0; k < j; k++) {
                    li[ind++] = temp[k];
                }
            }
        }
        System.out.println(li[n - 1]);
    }
}