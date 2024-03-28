<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1118

Expected output:
Yev

```
def main():
    N = input()

    a, b, c, d = list(N)
    if a == b == c or b == c == d:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) || s.charAt(1) == s.charAt(2) == s.charAt(3)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```

'''
<|endoftext|>
