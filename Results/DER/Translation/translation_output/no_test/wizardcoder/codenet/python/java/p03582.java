Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

### Response:
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    List<List<Integer>> L = new ArrayList<>();
    L.add(Arrays.asList(0));
    L.add(Arrays.asList(1));
    L.add(Arrays.asList(2));
    while (L.size() > 1) {
      List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < L.get(0).size(); i++) {
        temp.add(L.get(0).get(i) + L.get(1).get(i));
      }
      L.remove(1);
      L.add(temp);
      Collections.sort(L.get(0));
    }
    String result = "";
    for (int i : L.get(0)) {
      result += "abc"[i];
    }
    System.out.println(result);
  }
}
```<|endoftext|>
