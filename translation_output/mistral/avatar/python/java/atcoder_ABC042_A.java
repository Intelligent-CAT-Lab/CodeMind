<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        int[] ABC = new int[splitInput.length];
        for (int i = 0; i < splitInput.length; i++) {
            ABC[i] = Integer.parseInt(splitInput[i]);
        }
        if (Arrays.asList(ABC).contains(5) == 2) {
            if (Arrays.stream(ABC).sum() == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
