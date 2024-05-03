Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String C = "a";
        List<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        int idx = al.indexOf(C.charAt(0));
        System.out.println(al.get(idx + 1));
    }
}
```

This Java code does the same thing as your Python code. It creates a list of all lowercase letters, finds the index of the input character in the list, and then prints the character at the next index.
