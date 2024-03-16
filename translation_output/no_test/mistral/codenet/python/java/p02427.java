<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
#!/usr/bin/env python3
# Bitset 2 - Enumeration of Subsets 1


def subset(n):
    for i in range(2**n):
        yield [v for v in range(n) if i & (1 << v) > 0]


def run():
    n = int(input())

    for i, vs in enumerate(subset(n)):
        print("{}:{}".format(i, "".join([" {}".format(v) for v in vs])))


if __name__ == '__main__':
    run()


```
[/INST]
```java
import java.util.ArrayList;
import java.util.List;

public class Bitset2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        List<List<Integer>> subsets = subset(n);
        for (int i = 0; i < subsets.size(); i++) {
            System.out.println("{}:{}".formatted(i, " ".join(subsets.get(i).stream().mapToObj(String::valueOf).toArray(String[]::new))));
        }
    }

    public static List<List<Integer>> subset(int n) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> vs = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    vs.add(j);
                }
            }
            subsets.add(vs);
        }
        return subsets;
    }
}
```</s>
