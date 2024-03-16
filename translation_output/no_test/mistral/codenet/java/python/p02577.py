<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

```
[/INST]
```python
import sys

def main():
    s = input()
    c = 0
    for i in range(len(s)):
        c += int(s[i])
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```</s>
