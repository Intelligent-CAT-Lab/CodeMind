import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (B >= C && C >= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}