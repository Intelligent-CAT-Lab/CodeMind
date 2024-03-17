<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab


```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[a+b+c];
        for(int i=0;i<a;i++) arr[i] = 0;
        for(int i=0;i<b;i++) arr[i+a] = 1;
        for(int i=0;i<c;i++) arr[i+a+b] = 2;
        Arrays.sort(arr);
        System.out.print(arr[0] == 0? "a" : arr[0] == 1? "b" : "c");
    }
}
```
'''
<|endoftext|>
