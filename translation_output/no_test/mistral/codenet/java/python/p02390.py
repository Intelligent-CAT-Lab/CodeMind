<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}

```
[/INST]
```python
import sys

def main():
    S = int(input())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = hi % 60
    print(f"{h:02d}:{m:02d}:{s:02d}")

if __name__ == "__main__":
    main()
```</s>
