<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
a,*b,c = input()
print(a+str(len(b))+c)

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("");
        System.out.println(arr[0]+arr.length-1+arr[arr.length-1]);
    }
}
```

'''
<|endoftext|>
