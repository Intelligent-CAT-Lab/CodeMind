<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
A

Expected output:
T


```
import java.util.Scanner;
public class p03085 {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    final String helix = scanner.next();
    scanner.close();
    switch(helix) {
      case "A":
        System.out.println("T");
        break;
      case "T":
        System.out.println("A");
        break;
      case "C":
        System.out.println("G");
        break;
      case "G":
        System.out.println("C");
        break;
    }
  }
}
```

python code:<fim_suffix><fim_middle>

```python
helix = input()
if helix == 'A':
    print('T')
elif helix == 'T':
    print('A')
elif helix == 'C':
    print('G')
elif helix == 'G':
    print('C')
```

'''
<|endoftext|>
