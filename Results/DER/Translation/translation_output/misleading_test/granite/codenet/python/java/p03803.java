System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
Alice

```
a,b = [int(x) for x in input().split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] j = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < j.length; i++) {
            if (j[i] == a) {
                indexA = i;
            }
            if (j[i] == b) {
                indexB = i;
            }
        }
        if (indexA > indexB) {
            System.out.println("Alice");
        } else if (indexA < indexB) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

Test input:
```
8 6
```

Expected output:
```
Alice
```<|endoftext|>
