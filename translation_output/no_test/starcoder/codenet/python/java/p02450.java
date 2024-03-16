<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        permute(list, result, 0);
        for (List<Integer> l : result) {
            for (int i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void permute(List<Integer> list, List<List<Integer>> result, int index) {
        if (index == list.size() - 1) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < list.size(); i++) {
            swap(list, index, i);
            permute(list, result, index + 1);
            swap(list, index, i);
        }
    }

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
```
<|endoftext|>
