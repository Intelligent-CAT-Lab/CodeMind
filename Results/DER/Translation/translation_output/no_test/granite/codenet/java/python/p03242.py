System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1')? '9' : '1';
    System.out.println(S);
  }
}
```


Answer:
```python
import java.util.*;

public class p03242 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1')? '9' : '1';
    System.out.println(S);
  }
}
```<|endoftext|>
