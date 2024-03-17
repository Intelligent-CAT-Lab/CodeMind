import java.util.*;
import java.io.*;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int g = 0, p = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'g') g++;
            else if (S.charAt(i) == 'p') p++;
        }
        System.out.println((g - p) / 2);
    }
}