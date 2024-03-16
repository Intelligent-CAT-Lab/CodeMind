Here is the equivalent Java code for the provided Python code. Please note that Java code is typically more verbose than Python. I have included all necessary imports and a main method for testing your sample input "hcpc".

```java
import java.util.HashMap;
import java.util.Scanner;

public class AlphabetBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        HashMap<Character, Integer> dic = new HashMap<>();
        for (char s : input.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (int count : dic.values()) {
            if ((count & 1) == 1) {
                ans += 1;
            }
        }
        System.out.println(ans >> 1);
        scanner.close();
    }
}
```

You can compile and run the above Java program to test the sample input "hcpc":

```sh
javac AlphabetBlock.java
java AlphabetBlock
```

When prompted, enter the test input, and you should expect to see the output "1".
