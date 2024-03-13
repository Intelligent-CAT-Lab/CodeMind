import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int MOD = (int)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }

    static void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(String.join("", Collections.nCopies(n / 4, "abcd")) + "abc".substring(0, n % 4));
    }
}