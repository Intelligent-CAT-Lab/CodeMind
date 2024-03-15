Here is the translated Java code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PuddleCalculator {

    private static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        List<int[]> g = new ArrayList<>();
        g.add(new int[]{0, 0}); // false is represented as 0
        
        for (char c : input.toCharArray()) {
            g.add(new int[]{func(c), 0});
        }
        
        int gmax = g.get(0)[0];
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1)[0] < g.get(i)[0] && g.get(i)[0] <= gmax) {
                g.get(i)[1] = 1; // true is represented as 1
            }
            gmax = Math.max(gmax, g.get(i)[0]);
        }
        
        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer surfaceLevel = null;
        
        for (int i = g.size() - 1; i >= 0; i--) {
            if (surfaceLevel != null) {
                volume += surfaceLevel - g.get(i)[0];
                if (surfaceLevel.equals(g.get(i)[0])) {
                    puddles.add(volume);
                    surfaceLevel = null;
                    volume = 0;
                }
            }
            if (surfaceLevel == null && g.get(i)[1] == 1) {
                surfaceLevel = g.get(i)[0];
            }
        }
        
        // Reverse the puddles list
        List<Integer> reversedPuddles = new ArrayList<>();
        for (int i = puddles.size() - 1; i >= 0; i--) {
            reversedPuddles.add(puddles.get(i));
        }
        
        // Print the sum of all puddles and their details
        System.out.println(reversedPuddles.stream().mapToInt(Integer::intValue).sum());
        System.out.print(reversedPuddles.size());
        for (int puddleVolume : reversedPuddles) {
            System.out.print(" " + puddleVolume);
        }
        scanner.close();
    }

    private static int func(char c) {
        switch (c) {
            case '/':
                cnt += 1;
                break;
            case '\\':
                cnt -= 1;
                break;
            case '_':
                // cnt += 0; // Implicitly no change, so this line can be omitted.
                break;
        }
        return cnt;
    }
}
```

This Java program has the same functionality as the Python code provided. Note that Java is strongly typed, so I replaced the Python global variable functionality with a private static class field and the Python tuples with integer arrays. Booleans in Python were replaced with 0 (false) and 1 (true) since we're using integer arrays in Java. The print statements are adapted to work like Python's print function by using Java's System.out.print and System.out.println. The lambda expressions and streams are used to calculate the sum of the volumes in the puddles list in an idiomatic Java way.
