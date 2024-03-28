```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int n = 2;
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            numbers.add(i);
        }
        
        List<List<Integer>> permutations = permute(numbers);
        
        for(List<Integer> p : permutations) {
            for(int num : p) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static List<List<Integer>> permute(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, List<Integer> nums){
        if(tempList.size() == nums.size()){
            result.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.size(); i++){ 
                if(tempList.contains(nums.get(i))) continue;
                tempList.add(nums.get(i));
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
```
