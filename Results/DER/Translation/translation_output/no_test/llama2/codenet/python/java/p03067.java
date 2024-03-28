<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if a<c<b or a>c>b:
  print('Yes')
else:
  print('No')
```

### Hint

- Use ```Integer.parseInt()``` to convert the input to integer.
- Use ```Arrays.sort()``` to sort the array.
- Use ```Arrays.binarySearch()``` to search the array.

### Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        Arrays.sort(new int[]{a,b,c});
        if (Arrays.binarySearch(new int[]{a,b,c}, c) < Arrays.binarySearch(new int[]{a,b,c}, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
</s>
