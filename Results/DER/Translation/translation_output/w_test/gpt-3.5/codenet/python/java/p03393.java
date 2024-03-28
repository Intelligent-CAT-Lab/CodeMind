```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String s = STR();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (s.indexOf(tmp) == -1) {
                    out.println(s + tmp);
                    out.close();
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (char j = (char)(s.charAt(i) + 1); j <= 'z'; j++) {
                    if (s.substring(0, i).indexOf(j) == -1) {
                        out.println(s.substring(0, i) + j);
                        out.close();
                    }
                }
            }
            out.println(-1);
            out.close();
        }
    }

    static String STR() throws IOException {
        return br.readLine();
    }

    static int INT() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static String[] S_LIST() throws IOException {
        return br.readLine().split("\\s+");
    }
}
```

