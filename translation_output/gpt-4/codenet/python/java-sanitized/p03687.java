import java.util.Scanner;
import java.util.HashMap;

public class p03687 {
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