Here's the equivalent Java code for your provided Python script:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ArrayList<ArrayList<Integer>> L = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(0);
            L.add(sublist);
        }
        for (int i = 0; i < b; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(1);
            L.add(sublist);
        }
        for (int i = 0; i < c; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(2);
            L.add(sublist);
        }

        while (L.size() > 1) {
            ArrayList<Integer> firstList = L.get(0);
            firstList.addAll(L.remove(L.size() - 1));
            Collections.sort(L, (list1, list2) -> {
                for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                    if (!list1.get(i).equals(list2.get(i))) {
                        return list1.get(i) - list2.get(i);
                    }
                }
                return list1.size() - list2.size();
            });
        }

        StringBuilder result = new StringBuilder();
        for (Integer i : L.get(0)) {
            result.append(("abc").charAt(i));
        }

        System.out.println(result.toString());
        scanner.close();
    }
}
```

Please note the following while translating the code from Python to Java:
1. Java does not have an equivalent of Python's tuple unpacking, so we declare variables `a`, `b`, and `c` separately and use a `Scanner` to read inputs.
2. Java does not have list comprehensions or the `map` function as in Python, so we initialize the lists in a loop.
3. Java's lists are not sortable by default the way Python's are, so we use the `Collections.sort()` method and define a custom comparator to sort the lists in `L.` 
4. The `remove` method of ArrayList in Java returns the element that was removed, which allows us to directly concatenate it with the first list.
5. `L.get(0)` represents the first list in `L`, which is the only one remaining after the consolidation process.
6. We use a `StringBuilder` to concatenate characters representing `'a'`, `'b'`, and `'c'`, as it is more efficient than repeated string concatenation in Java.
