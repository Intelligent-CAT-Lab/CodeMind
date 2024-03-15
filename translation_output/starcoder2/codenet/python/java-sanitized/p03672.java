import java.util.*;
import java.io.*;

public class p03672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        List<Integer> lll = new ArrayList<>();
        for (int i = 1; i < len - 1; i += 2) {
            lll.add(i);
        }
        for (int i : lll) {
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            }
        }
    }
}