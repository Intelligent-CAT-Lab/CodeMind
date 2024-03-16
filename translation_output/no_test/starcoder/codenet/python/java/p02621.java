<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print(a + a ** 2 + a ** 3)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a + a * a + a * a * a);
    }
}
```
"""

def main():
    pass


if __name__ == "__main__":
    main()
<|endoftext|>
