```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine().trim();

        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (s.indexOf(tmp) == -1) {
                    System.out.println(s + tmp);
                    System.exit(0);
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = s.charAt(i) + 1; j <= 'z'; j++) {
                    if (s.substring(0, i).indexOf((char) j) == -1) {
                        System.out.println(s.substring(0, i) + (char) j);
                        System.exit(0);
                    }
                }
            }
            System.out.println(-1);
            System.exit(0);
        }
    }
}
```
