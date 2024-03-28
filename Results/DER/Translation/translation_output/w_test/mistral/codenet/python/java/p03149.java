<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YES


```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        int[] b = {1, 4, 7, 9};
        Arrays.sort(a);
        if (Arrays.equals(a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
