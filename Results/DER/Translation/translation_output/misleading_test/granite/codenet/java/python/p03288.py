System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1199

Expected output:
QBc

```
import java.util.*;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

```


Answer:
```python
r = int(input())
if r < 1200:
    print("ABC")
elif r < 2800:
    print("ARC")
else:
    print("AGC")
```

Test input:
```
1199
```

Expected output:
```
QBc
```<|endoftext|>
