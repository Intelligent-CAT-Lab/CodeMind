import java.util.*;
import java.io.*;

public class codeforces_203_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] split = input.split(" ");
        int t = Integer.parseInt(split[0]);
        int a = Integer.parseInt(split[1]);
        int b = Integer.parseInt(split[2]);
        int d = Integer.parseInt(split[3]);
        int[] da = new int[t];
        int[] db = new int[t];
        for (int i = 0; i < t; i++) {
            String[] split2 = br.readLine().split(" ");
            da[i] = Integer.parseInt(split2[0]);
            db[i] = Integer.parseInt(split2[1]);
        }
        for (int i = 0; i < t; i++) {
            if (a - da[i] * i + b - db[i] * i == d || a - da[i] * i == d || b - db[i] * i == d || d == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}