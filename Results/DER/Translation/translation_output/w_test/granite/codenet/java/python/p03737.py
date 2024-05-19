System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```


Answer:
```python
s = input().split()
print(''.join(c[0].upper() for c in s))
```

Test input:
```
atcoder beginner contest
```

Expected output:
```
ABC
```<|endoftext|>
