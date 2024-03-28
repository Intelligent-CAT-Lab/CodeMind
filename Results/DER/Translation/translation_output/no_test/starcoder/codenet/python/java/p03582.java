<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        L.add(0,0);
        L.add(0,1);
        L.add(0,2);
        while(L.size()>1){
            L.set(0,L.get(0)+L.get(L.size()-1));
            Collections.sort(L);
            L.remove(L.size()-1);
        }
        System.out.println(String.valueOf(L.get(0)));
    }
}
```
<|endoftext|>
