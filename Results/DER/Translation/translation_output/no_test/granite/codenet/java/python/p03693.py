System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```


Answer:
```python
import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    sum = r * 100 + g * 10 + b
    if sum % 4 == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```<|endoftext|>
