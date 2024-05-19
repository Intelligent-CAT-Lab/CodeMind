System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
700 600 780

Expected output:
1222

```
import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}

```


Answer:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    sum = [a, b, c]
    sum.sort()
    print(sum[0] + sum[1])

if __name__ == "__main__":
    main()
```

Test input:
```
700 600 780
```

Expected output:
```
1222
```<|endoftext|>
