import java.util.*;
import java.io.*;

public class p03672 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        for (int i = n - 2; i >= 1; i -= 2) {
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            }
        }
    }
}