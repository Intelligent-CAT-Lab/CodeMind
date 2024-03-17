<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
117

Expected output:
Yes


```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7")? "Yes" : "No");
    }
}
```

python code:<fim_suffix><fim_middle>

```python
n = int(input())
print("Yes" if str(n).find("7")!= -1 else "No")
```

"""
<|endoftext|>
