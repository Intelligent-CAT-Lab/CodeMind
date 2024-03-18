```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String s = br.readLine();
            if (s.length() < 26) {
                for (int i = 0; i < 26; i++) {
                    char tmp = (char) (i + 'a');
                    if (s.indexOf(tmp) == -1) {
                        bw.write(s + tmp);
                        break;
                    }
                }
            } else {
                for (int i = 25; i >= 0; i--) {
                    for (int j = s.charAt(i) + 1; j <= 'z'; j++) {
                        char c = (char) j;
                        if (s.substring(0, i).indexOf(c) == -1) {
                            bw.write(s.substring(0, i) + c);
                            break;
                        }
                    }
                }
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
