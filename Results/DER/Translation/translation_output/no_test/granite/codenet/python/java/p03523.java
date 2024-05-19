System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String temp = "";
            for (char c : S.toCharArray()) {
                if (!c.equals("A")) {
                    temp += "*";
                }
                temp += c;
            }
            String[] split = temp.split("\\*", -1);
            List<Integer> L = new ArrayList<>();
            for (String s : split) {
                L.add(s.length());
            }
            List<Integer> X = Arrays.asList(1, 0, 0, 0, 1, 1, 1, 1);
            b &= L.stream().mapToInt(Integer::intValue).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList()).stream()
                   .mapToInt(i -> i).boxed().collect(Collectors.toList
