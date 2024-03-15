<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x = int(raw_input())
print x*x*x
```

### Solution

```java
int x = Integer.parseInt(br.readLine());
System.out.println(x*x*x);
```

### Explanation

```
x = int(raw_input())
```

This line is used to read the input from the user and store it in the variable x.

```
print x*x*x
```

This line is used to print the value of x multiplied by itself three times.

### Code

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        int x = Integer.parseInt(br.readLine());
        System.out.println(x*x*x);
    }
}
```
</s>
