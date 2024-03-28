Below is the translated Java version of the provided Python code, enclosed within ```java``` tags:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        List<Pair> g = new ArrayList<>();
        g.add(new Pair(0, false));
        for (char c : input.toCharArray()) {
            g.add(new Pair(func(c), false));
        }

        int gmax = g.get(0).value;
        for (int i = 1; i < g.size(); i++) {
            if (g.get(i - 1).value < g.get(i).value && g.get(i).value <= gmax) {
                g.get(i).flag = true;
            }
            gmax = Math.max(gmax, g.get(i).value);
        }

        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        Integer surfaceLevel = null;

        for (int i = g.size() - 1; i >= 0; i--) {
            if (surfaceLevel != null) {
                volume += surfaceLevel - g.get(i).value;
                if (surfaceLevel.equals(g.get(i).value)) {
                    puddles.add(volume);
                    surfaceLevel = null;
                    volume = 0;
                }
            }
            if (surfaceLevel == null && g.get(i).flag) {
                surfaceLevel = g.get(i).value;
            }
        }

        int puddleSum = puddles.stream().mapToInt(Integer::intValue).sum();
        System.out.println(puddleSum);
        System.out.print(puddles.size());
        for (int val : puddles) {
            System.out.print(" " + val);
        }
    }

    private static int func(char c) {
        cnt += getValue(c);
        return cnt;
    }

    private static int getValue(char c) {
        switch (c) {
            case '/':
                return 1;
            case '\\':
                return -1;
            case '_':
            default:
                return 0;
        }
    }

    static class Pair {
        int value;
        boolean flag;

        Pair(int value, boolean flag) {
            this.value = value;
            this.flag = flag;
        }
    }
}
```

Please note, that the choice of using a `Pair` member class to store the `value` and the `flag` for each character `c` is to mimic the tuple `g[i]` in Python which stores the current count and a boolean flag. Also, `scanner.nextLine()` is used to read the test input from standard input, assuming that the user is providing a line of characters as the input. You should also ensure that the input of the Java program is provided in the same manner as the provided Python test case `\\//`.
