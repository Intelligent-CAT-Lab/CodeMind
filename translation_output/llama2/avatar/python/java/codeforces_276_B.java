<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = list ( input ( ) )
x = True
dt = { }
for i in s :
    if i in dt :
        dt [ i ] += 1
    else :
        dt [ i ] = 1
cnt = 0
x = True
for key , value in dt . items ( ) :
    if value % 2 != 0 and cnt < 1 :
        cnt += 1
    elif value % 2 != 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( " First " )
elif not x and len ( s ) % 2 == 0 :
    print ( " Second " )
elif not x and len ( s ) % 2 != 0 :
    print ( " First " )


```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] count = new int[1000001];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int cnt = 0;
        for (int i = 0; i < 1000001; i++) {
            if (count[i] % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (count[i] % 2 != 0 && cnt >= 1) {
                break;
            }
        }
        if (cnt == 0) {
            System.out.println("First");
        } else if (cnt == 1) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```
</s>
