import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0) {
            if (m != 0)
                System.out.println("Impossible");
            else
                System.out.println(0 + " ▁ " + 0);
            return;
        }

        if (m <= n) {
            if (m == 0) {
                m = 1;
            }
            System.out.print(n + " ▁ " + (m + n - 1));
            return;
        }

        System.out.print(m + " ▁ " + (m + n - 1));
    }
}