Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char C = 'C';
        List<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        int idx = al.indexOf(C);
        System.out.println(al.get(idx + 1));
    }
}
```

This Java code does the same thing as your Python code. It creates a list of all lowercase letters, finds the index of the character 'C' in the list, and then prints the character that is one position after 'C'.
