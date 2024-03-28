<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
print(int((n + 1) * n / 2)) 
```

### Hint

You can use the following code to get the input:
```
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(int((n + 1) * n / 2));
    }
}
```
</s>
