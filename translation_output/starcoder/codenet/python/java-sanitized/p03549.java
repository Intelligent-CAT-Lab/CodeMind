import java.util.*;
import java.io.*;

public class p03549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (2 ** M));
    }
}