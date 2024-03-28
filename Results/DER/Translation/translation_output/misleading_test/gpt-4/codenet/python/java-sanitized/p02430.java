import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p02430 {

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