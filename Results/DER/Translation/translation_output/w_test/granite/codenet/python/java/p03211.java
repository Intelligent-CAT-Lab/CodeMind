System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
34


```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            int num = Integer.parseInt(S.substring(i, i + 3));
            int diff = Math.abs(753 - num);
            if (diff < a) {
                a = diff;
            }
        }
        System.out.println(a);
    }
}
```

Test input:
```
1234567876
```

Expected output:
```
34
```<|endoftext|>
