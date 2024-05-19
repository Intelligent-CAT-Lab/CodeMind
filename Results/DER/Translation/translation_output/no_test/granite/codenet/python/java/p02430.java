System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import itertools

n, k = map(int, input().split())

l = range(n)
combs = list(itertools.combinations(l, k))

sumlist = []
for comb in combs:
    sum = 0
    for c in comb:
        sum += pow(2, c)
    sumlist.append(sum)

z = zip(sumlist, combs)
z = sorted(z)

sumlist, combs = zip(*z)

for sum, comb in zip(sumlist, combs):
    c_str = (' '.join(str(c) for c in comb))
    print(str(sum) + ": " + c_str)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> comb = new ArrayList<>();
            for (int j = i; j < n; j++) {
                comb.add(l.get(j));
                if (comb.size() == k) {
                    combs.add(comb);
                    comb = new ArrayList<>();
                }
            }
        }

        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        List<List<Integer>> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            List<Integer> pair = new ArrayList<>();
            pair.add(sumlist.get(i));
            pair.add(combs.get(i));
            z.add(pair);
        }

        Collections.sort(z, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        List<Integer> sortedSumlist = new ArrayList<>();
        List<List<Integer>> sortedCombs = new ArrayList<>();
        for (List<Integer> pair : z) {
            sortedSumlist.add(pair.get(0));
            sortedCombs.add(pair.get(1));
        }

        for (int i = 0; i < sortedSumlist.size(); i++) {
            String combStr = "";
            for (int c : sortedCombs.get(i)) {
                combStr += c + " ";
            }
            System.out.println(sortedSumlist.get(i) + ": " + combStr.trim());
        }
    }
}
```<|endoftext|>
