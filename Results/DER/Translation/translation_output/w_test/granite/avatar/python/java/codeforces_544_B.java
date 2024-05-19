System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
NO


```
numbers = list ( map ( int, input ( ). split ( ) ) )
start = 0
arr = [ ]
count = 0
for i in range ( 0, numbers [ 0 ] ) :
    string = " "
    next = start
    for j in range ( 0, numbers [ 0 ] ) :
        if count < numbers [ 1 ] :
            if j == next :
                string +='L '
                count += 1
                next += 2
                if next >= numbers [ 0 ] :
                    start = 1 if start == 0 else 0
            else :
                string += " S "
        else :
            string += " S "
    arr. append ( string )
if count < numbers [ 1 ] :
    print ( " NO " )
else :
    print ( " YES " )
    for i in arr :
        print ( i )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int start = 0;
        int next = 0;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        sb.append(" L ");
                        count++;
                        next = (next + 2) % n;
                        if (next == 0) {
                            start = 1;
                        }
                    } else {
                        sb.append(" S ");
                    }
                } else {
                    sb.append(" S ");
                }
            }
            ans[i] = sb.toString();
        }
        if (count < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : ans) {
                System.out.println(s);
            }
        }
    }
}
```

Test input:
```
100 100000
```

Expected output:
```
NO
```<|endoftext|>
