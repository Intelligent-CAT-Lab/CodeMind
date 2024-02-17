import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 1552
 *  2020/5/10
 */
public class Main {

    PrintStream log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    PrintStream result = System.out;
    Scanner sc = new Scanner(System.in);

    void main() throws IOException {

        int N = sc.nextInt();

        int 高原 = 0;
        int 盆地 = 0;
        int 山腹 = 0;
        int 峰 = 0;
        int 窪地 = 0;
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i < N; i++) {
            if (a[i - 1] == a[i])
                continue;
            int k;
            for(k = i; k < N - 1; k++) {
                if (a[k] != a[k + 1]) {
                    break;
                }
            }
            if (k < N - 1) {
                if (a[i - 1] > a[i] && a[k] > a[k + 1]) {
                    if (i < k) {
                        山腹++;
                    }
                }
                if (a[i - 1] < a[i] && a[k] < a[k + 1]) {
                    if (i < k) {
                        山腹++;
                    }
                }
                if (a[i - 1] > a[i] && a[k] < a[k + 1]) {
                    if (i < k) {
                        盆地++;
                    }
                    else {
                        窪地++;
                    }
                }
                if (a[i - 1] < a[i] && a[k] > a[k + 1]) {
                    if (i < k) {
                        高原++;
                    }
                    else {
                        峰++;
                    }
                }
            }
        }

        result.println(高原 + " " + 盆地 + " " + 山腹 + " " + 峰 + " " + 窪地);
    }


    public static void main(String[] args) throws IOException {
        new Main().main();
    }


}


