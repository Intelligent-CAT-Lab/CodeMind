```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        List<String> a = new ArrayList<>(Arrays.asList(input.split(" ")));
        
        String mostFrequent = a.stream()
                                .max(Comparator.comparingInt(str -> Collections.frequency(a, str)))
                                .orElse(null);

        String longestString = a.stream()
                                .max(Comparator.comparingInt(String::length))
                                .orElse(null);

        System.out.println(mostFrequent + " " + longestString);
    }
}
```
