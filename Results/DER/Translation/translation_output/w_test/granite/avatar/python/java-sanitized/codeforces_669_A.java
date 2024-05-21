import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class codeforces_669_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if (n % 3 == 0) {
            System.out.println(n / 3 * 2);
        } else if (n < 3) {
            System.out.println(1);
        } else {
            System.out.println(n / 3 * 2 + 1);
        }
    }
}