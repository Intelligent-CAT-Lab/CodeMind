import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        for (int i = s.length() - 2; i > 0; i -= 2) {
            System.err.print("range: ");
            System.err.println(i);
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                System.err.print("debug: ");
                System.err.println("false this time");
            }
        }
    }
}