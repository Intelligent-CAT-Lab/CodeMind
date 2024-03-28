```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = new int[6];
        
        for (int i = 0; i < a.length; i++) {
            numlist[i] = countSubstrings(S, a[i]);
        }
        
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);
        numlist[0] += (numlist[4] + numlist[5]);
        
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static int countSubstrings(String mainStr, String substr) {
        int count = 0;
        int index = mainStr.indexOf(substr);
        
        while (index != -1) {
            count++;
            index = mainStr.indexOf(substr, index + 1);
        }
        
        return count;
    }
}
```

