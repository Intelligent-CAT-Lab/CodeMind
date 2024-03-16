Here is the equivalent Java code for the provided Python snippet. The Java code takes an integer as an input and computes the result in a similar manner to the Python function:

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        
        System.out.println(aaa("0"));
    }
    
    static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        
        Set<Character> digits = new HashSet<>();
        for (char c : n.toCharArray()) {
            digits.add(c);
        }
        
        int ans = digits.equals(Set.of('7', '5', '3')) ? 1 : 0;
        for (char i : new char[]{'7', '5', '3'}) {
            ans += aaa(n + i);
        }
        return ans;
    }
}
```

This Java code should provide the same output as the original Python code when given the same input. It defines a main method that reads an integer from the standard input, and a recursive method `aaa` to calculate the result. Note that `Set.of()` is available from Java 9 onwards. If you need to support earlier versions of Java, you could initialize the set in a different way (e.g., using `Arrays.asList()` or by manually adding elements to the set). Also, remember to close the `Scanner` object when it's no longer needed, to avoid resource leaks. For the sake of the example, I left it open since it's reading from standard input and the program ends shortly afterward.
