import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < k; i++) {
            s.append("ACL");
        }
        System.out.println(s.toString());
    }
}