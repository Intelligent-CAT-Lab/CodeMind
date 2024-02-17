import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] str = scan.next().toCharArray();
        int n = str.length;
        TreeMap<Double, Integer> sumIdx = new TreeMap<>();
        for (char c = 'a'; c <= 'z'; c++){
            double sum = 0;
            sumIdx.clear();
            sumIdx.put(0.0, -1);
            for (int i=0;i<n;i++) {
                sum += str[i] == c? 0.5: -0.5;
                Map.Entry<Double, Integer> lower = sumIdx.lowerEntry(sum);
                if (lower != null) {
                    if (lower.getValue() == i - 1) lower = sumIdx.lowerEntry(lower.getKey());
                    if (lower != null) {
                        System.out.println(lower.getValue() + 2 + " " + (i+1));
                        return;
                    }
                }
                sumIdx.putIfAbsent(sum, i);
            }
        }
        System.out.println("-1 -1");
    }
}
