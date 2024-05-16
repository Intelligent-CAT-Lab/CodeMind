System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02765 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n < 10){
            System.out.println(r+ (10 - n) * 100);
        
        }else{
            System.out.println(r);
        }
    }
}

```


Answer:
```python
import sys

def main():
    n, r = map(int, sys.stdin.readline().split())
    if n < 10:
        print(r + (10 - n) * 100)
    else:
        print(r)

if __name__ == "__main__":
    main()
```<|endoftext|>
