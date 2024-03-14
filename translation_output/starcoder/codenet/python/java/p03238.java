<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
if n==1:
    print('Hello World')
    exit()
a = int(input())
b = int(input())
print(a+b)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==1){
            System.out.println("Hello World");
            return;
        }
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a+b);
    }
}
```

'''
<|endoftext|>
