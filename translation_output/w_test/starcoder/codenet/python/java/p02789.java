<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
Yes


```
a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
'''
<|endoftext|>
