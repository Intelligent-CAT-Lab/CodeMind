<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES

```

ABC = tuple ( map ( int , input ( ) . split ( ) ) )
if ABC . count ( 5 ) == 2 :
    print ( ' YES ' if sum ( ABC ) == 17 else ' NO ' )
else :
    print ( ' NO ' )


```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        Arrays.fill(ABC, scanner.nextInt());
        if (Arrays.asList(ABC).contains(5) == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
