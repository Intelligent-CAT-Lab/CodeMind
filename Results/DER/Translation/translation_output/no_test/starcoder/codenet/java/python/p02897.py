<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```
"""
<|endoftext|>
