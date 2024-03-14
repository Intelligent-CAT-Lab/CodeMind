import java.util.*;
public class codeforces_672_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] li = new int[370];
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int p = i, q = i;
            int count = 0;
            while (p!= 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li[ind] = i;
                ind++;
            }
            if (count == 2) {
                int[] temp = new int[count];
                while (q!= 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[count - 1] = x;
                    count--;
                }
                for (int j = 0; j < count; j++) {
                    li[ind] = temp[j];
                    ind++;
                }
            }
            if (count == 3) {
                int[] temp = new int[count];
                while (q!= 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[count - 1] = x;
                    count--;
                }
                for (int j = 0; j < count; j++) {
                    li[ind] = temp[j];
                    ind++;
                }
            }
        }
        li[ind - 2] = 0;
        li[ind - 1] = 0;
        int n = sc.nextInt();
        System.out.println(li[n - 1]);
    }
}