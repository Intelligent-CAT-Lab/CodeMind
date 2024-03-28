<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_58_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ");
                m = i;
            }
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_58_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ");
                m = i;
            }
        }
    }
}
```
"""
<|endoftext|>
