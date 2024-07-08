import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
var newVariable_0 = scan.next();        char[] str = newVariable_0.toCharArray();
        int n = str.length;
        TreeMap<Double, Integer> sumIdx = new TreeMap<>();
        for (char c = 'a'; c <= 'z'; c++){
            double sum = 0;
            sumIdx.clear();
var newVariable_1 = sumIdx.put(0.0, -1);            for (int i=0;i<n;i++) {
                sum += str[i] == c? 0.5: -0.5;
                Map.Entry<Double, Integer> lower = sumIdx.lowerEntry(sum);
                if (lower != null) {
var newVariable_2 = lower.getValue();var newVariable_3 = lower.getKey();                    if (lower.getValue() == i - 1) lower = sumIdx.lowerEntry(newVariable_3);
                    if (lower != null) {
                        System.out.println(lower.getValue() + 2 + " " + (i+1));
                        return;
                    }
                }
var newVariable_4 = sumIdx.putIfAbsent(sum, i);            }
        }
        System.out.println("-1 -1");
    }
}
