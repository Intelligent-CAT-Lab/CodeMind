<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[::2])
```

### Solution

```java
String s = input();
System.out.println(s[::2]);
```

### Explanation

```
s = input()
```

Input a string.

```
print(s[::2])
```

Print the even characters of the string.

### Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s[::2]);
    }
}
```
</s>
