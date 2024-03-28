import java.util.*;
import java.io.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("abcd".repeat(n / 4) + "abcd".substring(0, n % 4));
        sc.close();
    }
}