import java.util.*;
import java.io.*;

public class p02946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        for (int i = Math.max(X - K + 1, -1000000); i < Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}