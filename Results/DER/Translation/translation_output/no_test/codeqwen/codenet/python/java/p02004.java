Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        ArrayList<Integer> rr = new ArrayList<>();

        int f(String n) {
            int r = 0;
            int t = 0;
            for (char c : n.toCharArray()) {
                if (c == 'R') {
                    t += 1;
                    if (t == 4) {
                        r += 1;
                        t = 0;
                    }
                } else {
                    t -= 1;
                    if (t == -4) {
                        t = 0;
                    }
                }
            }
            return r;
        }

        while (true) {
            String n = new Scanner(System.in).nextLine();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
            break;
        }

        return String.join("\n", rr.stream().map(String::valueOf).collect(Collectors.toList()));
    }
}
```

Please note that this Java code assumes that the input is provided via the console. If you want to read input from a file, you will need to modify the code accordingly.
