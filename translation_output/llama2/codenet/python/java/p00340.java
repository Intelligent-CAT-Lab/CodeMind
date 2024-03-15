<s> Translate the following python code to java and enclose your solution inside ```java```:
```
num = list(map(int,input().split()))
num.sort()
if num[0] == num[1] and num[2] ==num[3]:
    print("yes")
else :
    print("no")

```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[4];
        for(int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        num = num.clone();
        num.sort();
        if(num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```
</s>
