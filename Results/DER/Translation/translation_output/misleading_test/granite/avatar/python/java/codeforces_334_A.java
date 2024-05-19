System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
1 36
2 35
3 34
4 33
5 32
6 31
7 30
8 29
9 28
10 27
11 26
12 25
13 24
14 23
15 22
16 21
17 20
18 19


```
n = int ( input ( ) )
i, j = 1, n * n
while i < j :
    print ( i, j )
    i += 1
    j -= 1


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```

Test input:
```
6
```

Expected output:
```
1 36
2 35
3 34
4 33
5 32
6 31
7 30
8 29
9 28
10 27
11 26
12 25
13 24
14 23
15 22
16 21
17 20
18 19
```<|endoftext|>
