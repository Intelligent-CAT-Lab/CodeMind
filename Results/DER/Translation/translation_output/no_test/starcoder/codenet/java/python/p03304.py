<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```
"""
<|endoftext|>
