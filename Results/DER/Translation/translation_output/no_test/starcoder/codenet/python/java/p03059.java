<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, t = map(int, input().split())
print((t // a) * b)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        System.out.println((t / a) * b);
    }
}
```
"""

def main():
    pass


if __name__ == "__main__":
    main()
<|endoftext|>
