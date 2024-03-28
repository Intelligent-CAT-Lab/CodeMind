Here is the equivalent Java code for the given Python script:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CombinationsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        List<ComboSum> comboList = new ArrayList<>();
        
        // use a bit mask to generate combinations
        for (int mask = 0; mask < (1 << n); mask++) {
            if (Integer.bitCount(mask) == k) {
                List<Integer> combo = new ArrayList<>();
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) > 0) {
                        sum += Math.pow(2, i);
                        combo.add(i);
                    }
                }
                comboList.add(new ComboSum(sum, combo));
            }
        }
        
        Collections.sort(comboList);

        for (ComboSum cs : comboList) {
            System.out.print(cs.sum + ": ");
            for (int i = 0; i < cs.combo.size(); i++) {
                System.out.print(cs.combo.get(i));
                if (i < cs.combo.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static class ComboSum implements Comparable<ComboSum> {
        int sum;
        List<Integer> combo;
        
        ComboSum(int sum, List<Integer> combo) {
            this.sum = sum;
            this.combo = combo;
        }
        
        @Override
        public int compareTo(ComboSum other) {
            return this.sum - other.sum;
        }
    }
}
```

A brief explanation:
- This Java code uses bit masking to generate combinations instead of the built-in `itertools.combinations` from the Python example. Each bit in a bitmask represents whether the corresponding index is included in the combination.
- The `ComboSum` class is used to pair the sum and combination of indices for sorting and easy access.
- We use an inner class `ComboSum` that is `Comparable` based on its sum to store the sum and the corresponding combination of numbers.
- The `main` method reads the inputs, generates the combinations, computes the sums, and then sorts the list of `ComboSum` objects before printing them in the requested format.
