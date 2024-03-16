Here is the translated Java code that performs the same functionality as the given Python code. Note that Java is a statically-typed language, so we will need to define the types of our variables explicitly, and we would use Java's standard library methods for input/output processing.

```java
import java.io.*;
import java.util.*;

public class ExpressionEvaluation {
    private static final int INF = Integer.MAX_VALUE;
    private static final Scanner scanner = new Scanner(System.in);
    private static HashMap<List<Object>, int[]> fm = new HashMap<>();

    public static void main(String[] args) {
        String s = scanner.nextLine();
        ArrayList<Object> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int ci = c - '0';
                if (!a.isEmpty() && a.get(a.size() - 1) instanceof Integer) {
                    a.set(a.size() - 1, (Integer) a.get(a.size() - 1) * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }

        int[] r = f(a);
        System.out.println(r[1]);
    }

    private static int[] f(ArrayList<Object> a) {
        Object key = a;
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        
        int n = a.size();        
        if (n == 1) {
            int value = (int) a.get(0);
            int[] r = { value, value };
            fm.put(new ArrayList<>(a), r);
            return r;
        }
        
        ArrayList<Object> b = new ArrayList<>(a.subList(1, n - 1));
        
        int[] ri = { INF };
        int[] ra = { -INF };
        for (int i = 1; i < n - 1; i++) {
            if (!(a.get(i) instanceof Character) || 
                (i > 1 && a.get(i - 2).equals('(')) ||
                (i + 2 < n && a.get(i + 2).equals(')'))) {
                continue;
            }
            ArrayList<Object> leftList = new ArrayList<>(b.subList(0, i));
            ArrayList<Object> rightList = new ArrayList<>(b.subList(i + 1, b.size()));
            int[] fl = f(leftList);
            int[] fr = f(rightList);
            char op = (char) a.get(i);
            if (op == '+') {
                ri[0] = Math.min(ri[0], fl[0] + fr[0]);
                ra[0] = Math.max(ra[0], fl[1] + fr[1]);
            } else if (op == '-') {
                ri[0] = Math.min(ri[0], fl[0] - fr[1]);
                ra[0] = Math.max(ra[0], fl[1] - fr[0]);
            }
        }
        
        int[] r = { ri[0], ra[0] };
        fm.put(new ArrayList<>(a), r);
        return r;
    }
}
```

To test this out, you would need to run the Java program and enter the input "1-(2+3-4+5)" when prompted. The expected output "5" should be displayed in the console. 

Note that the original Python code is reading from the standard input using `sys.stdin.readline()`. I replaced that with `Scanner.nextLine()` in Java to read a line of input from the standard input. The translation is designed to be as close as possible to the original Python logic, while idiomatic Java solutions would structure the code and approach differently.
