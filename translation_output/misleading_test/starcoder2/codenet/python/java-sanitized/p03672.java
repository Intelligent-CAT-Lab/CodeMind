import java.util.*;
import java.io.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] lll = new int[s.length() - 1];
        for (int i = 0; i < lll.length; i++) {
            lll[i] = i + 1;
        }
        for (int i : lll) {
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            }
        }
    }
}