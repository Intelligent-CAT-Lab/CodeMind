import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 1554
 *  2020/5/10
 */
public class Main {

    PrintStream log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    PrintStream result = System.out;
    Scanner sc = new Scanner(System.in);


    int get13f(int y2, int m2, int d2) {

        int y = 0;
        int m = 1;
        int d = 1;
        int w = 6;
        int cnt = 0;

        for(;;) {
            if (d == 13 && w == 5)
                cnt++;
            if (y == y2 && m == m2 && d == d2) {
                return cnt;
            }

            d++;
            w = (w + 1) % 7;
            int md = 31;
            if (m == 2) {
                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                    md = 29;
                else
                    md = 28;
            }
            else if (m == 4 || m == 6 || m == 9 || m == 11) {
                md = 30;
            }
            if (d > md) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                }
            }
        }
    }


    void main() throws IOException {

        long y1 = sc.nextLong();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        long y2 = sc.nextLong();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        long y1s = y1 / 400;
        int y1a = (int)(y1 % 400);
        if (d1 == 13)
            d1 = 12;
        long c1 = get13f(y1a, m1, d1);

        long y2s = y2 / 400;
        int y2a = (int)(y2 % 400);
        long c2 = get13f(y2a, m2, d2);

        // 400年間に13日の金曜日は688回ある
        result.println(688 * (y2s - y1s) + c2 - c1);
    }


    public static void main(String[] args) throws IOException {
        new Main().main();
    }


}


