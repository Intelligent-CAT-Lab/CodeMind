<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```

python code:<fim_suffix><fim_middle>
```python
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s[0:3]);
   }
}

```
<|endoftext|>
