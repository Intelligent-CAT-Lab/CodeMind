import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.StringTokenizer;

public class p03672 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            String s = br.readLine().trim();
            int[] lll = new int[(s.length() - 1) / 2];
            for (int i = 0; i < lll.length; i++) {
                lll[i] = lll.length - i;
            }
            
            for (int i : lll) {
                System.err.print("range" + ": ");
                for (int val : lll) {
                    System.err.print(val + " ");
                }
                
                if (s.substring(0, i/2).equals(s.substring(i/2, i))) {
                    pw.println(i);
                    pw.flush();
                    break;
                } else {
                    System.err.print("debug" + ": ");
                    System.err.println("false this time");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}