/p02148.md
# p02148

Translate the following java code to python and enclose your solution inside :

import java.util.*;

public class p02148 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }
}