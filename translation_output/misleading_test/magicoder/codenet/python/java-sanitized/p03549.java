import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int)Math.pow(2, M));
    }
}