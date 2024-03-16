<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(Math.max(0, x-t));
    }
}
```
"""

def main():
    pass


if __name__ == "__main__":
    main()
<|endoftext|>
