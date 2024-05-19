System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```


Answer:
Here's the Python code equivalent to the given Java code:

```python
import java.util.*;

public class p03241:
    public static void main(String[] a):
        s = Scanner(System.in)
        n = s.nextInt()
        m = s.nextInt()
        for i in range(m // n, 0, -1):
            if m % i == 0:
                print(i)
                break
```

This Python code does the same thing as the given Java code. It reads two integers from the user, `n` and `m`, and then finds the largest integer `i` such that `m` is divisible by `i` and `i` is less than or equal to `m // n`. It then prints `i` and exits the loop.<|endoftext|>
