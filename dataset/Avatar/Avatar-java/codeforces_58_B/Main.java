import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ▁ ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ▁ ");
                m = i;
            }
        }
    }
}