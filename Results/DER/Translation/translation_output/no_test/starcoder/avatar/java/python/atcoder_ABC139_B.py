<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}
```
"""

import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}
<|endoftext|>
