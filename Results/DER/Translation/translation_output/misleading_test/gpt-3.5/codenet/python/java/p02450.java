```java
import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        
        for (ArrayList<Integer> p : result) {
            for (int num : p) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void permute(ArrayList<Integer> nums, int start, ArrayList<ArrayList<Integer>> result) {
        if (start == nums.size()) {
            result.add(new ArrayList<>(nums));
        } else {
            for (int i = start; i < nums.size(); i++) {
                Collections.swap(nums, i, start);
                permute(nums, start + 1, result);
                Collections.swap(nums, i, start);
            }
        }
    }
}
```
