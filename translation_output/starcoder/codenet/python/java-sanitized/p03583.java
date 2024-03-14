import java.util.*;
public class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 0;
        int h = 0;
        int w = 0;
        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                int tmp1 = N * i * j;
                int tmp2 = (4 * i * j) - (N * j) - (N * i);
                if (tmp2!= 0) {
                    int s = tmp1 / tmp2;
                    if (s >= 0 && tmp1 % tmp2 == 0) {
                        n = i;
                        h = j;
                        w = s;
                        break;
                    }
                }
            }
        }
        System.out.println(n + " " + h + " " + w);
    }
}