<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```
[/INST]
```python
import sys

def main():
    a = int(input())
    b = int(input())
    ans = abs(a - b)
    print(ans)

if __name__ == "__main__":
    main()
```</s>
