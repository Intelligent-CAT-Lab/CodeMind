<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        System.out.println((3*a+p)/2);
    }
}
```
"""

def main():
    pass


if __name__ == "__main__":
    main()
<|endoftext|>
