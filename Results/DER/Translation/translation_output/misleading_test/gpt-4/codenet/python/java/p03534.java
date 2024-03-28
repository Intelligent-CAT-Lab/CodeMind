To translate the provided Python code into Java, you need to take into account several differences between the languages, such as the way input is handled, the static typing system in Java, the absence of a dictionary type (we'll use `HashMap` instead), and how string concatenation works. Here's the translation:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> dic = new HashMap<>();
        dic.put('a', 0);
        dic.put('b', 0);
        dic.put('c', 0);

        for(char c : s.toCharArray()) {
            dic.put(c, dic.get(c) + 1);
        }
        
        int a = dic.get('a');
        int b = dic.get('b');
        int c = dic.get('c');
        
        if (Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

To test this Java code with the input "abac", you would need to run the program, type "abac" into the console when prompted, and then hit Enter. The expected output "YES" will then be printed on the console.
