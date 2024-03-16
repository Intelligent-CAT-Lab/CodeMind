import java.util.*;
import java.io.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(func(N));
    }

    public static int func(int N) {
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                int tmp = 1;
                for (int k = 0; k < 20; k++) {
                    if (k == i) {
                        continue;
                    }
                    if (k < i) {
                        tmp *= 10;
                    } else {
                        tmp *= 9;
                    }
                }
                if (tmp > N) {
                    break;
                }
                ans += tmp;
            }
        }
        return ans;
    }
}