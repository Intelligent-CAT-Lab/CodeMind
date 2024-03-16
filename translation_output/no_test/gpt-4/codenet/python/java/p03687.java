```java
import java.util.Scanner;
import java.util.HashMap;

public class MinAdjacentSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        char[] S = inputStr.toCharArray();
        HashMap<Character, Integer> C = new HashMap<>();
        
        // Count the occurrences of each character
        for (char ch : S) {
            C.put(ch, C.getOrDefault(ch, 0) + 1);
        }
        
        int[] o = new int[C.size()];
        int index = 0;
        
        // Iterate over distinct characters in the Counter equivalent
        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S) {
                if (a == b) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o[index++] = m;
        }
        
        // Find minimum value in o
        int min = o[0];
        for (int i = 1; i < o.length; i++) {
            if (o[i] < min) {
                min = o[i];
            }
        }
        
        System.out.println(min);
        
        scanner.close();
    }
}
```

In this translation:
- I replaced Python's `Counter` with a `HashMap<Character, Integer>` to count occurrences of each character.
- For console input, I used a `Scanner`.
- I converted the list of minimum maximum distances 'o' to an array of integers.
- `Math.max()` replaces the Python `max()` function.
- I manually found the minimum value in the array 'o' since Java does not have a built-in method like Python's `min()` function for arrays.
