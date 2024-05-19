System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES

```

ABC = tuple ( map ( int, input ( ). split ( ) ) )
if ABC. count ( 5 ) == 2 :
    print ('YES'if sum ( ABC ) == 17 else'NO')
else :
    print ('NO')


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] == 5 && arr[1] == 5 && arr[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Test input:
5 5 7

Expected output:
YES<|endoftext|>
