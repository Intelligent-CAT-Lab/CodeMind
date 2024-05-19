System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int start = 0;
        List<String> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        sb.append(" L ");
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = start == 0? 1 : 0;
                        }
                    } else {
                        sb.append(" S ");
                    }
                } else {
                    sb.append(" S ");
                }
            }
            arr.add(sb.toString());
        }
        if (count < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}
```<|endoftext|>
