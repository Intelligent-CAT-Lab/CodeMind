import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        HashMap<Character, Integer> C = new HashMap<>();
        
        for (char ch : S) {
            C.put(ch, C.getOrDefault(ch, 0) + 1);
        }
        
        int[] o = new int[C.size()];
        int index = 0;  // To keep track of where to insert in o
        
        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S) {
                if (a == b) {
                    j = 0;
                } else {
                    j += 1;
                    m = Math.max(m, j);
                }
            }
            o[index++] = m; // Update the o array with the maximum value
        }
        
        int minInO = o[0];
        for (int i = 1; i < o.length; i++) {
            if (o[i] < minInO) {
                minInO = o[i]; 
            }
        }
        
        System.out.println(minInO);
        scanner.close();
    }
}