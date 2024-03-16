import java.util.*;
import java.io.*;

public class p02004 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s = br.readLine())!= null) {
            int r = 0;
            int t = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    t++;
                    if (t == 4) {
                        r++;
                        t = 0;
                    }
                } else {
                    t--;
                    if (t == -4) {
                        t = 0;
                    }
                }
            }
            bw.write(r + "\n");
        }
        bw.flush();
        bw.close();
    }
}