import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] str = scan.next().toCharArray();
System.out.println("[INST]7;str;scan.next().toCharArray();"+str);
System.out.println("[INST]7;None;scan.next();"+scan.next());
        int n = str.length;
        TreeMap<Double, Integer> sumIdx = new TreeMap<>();
        for (char c = 'a'; c <= 'z'; c++){
            double sum = 0;
            sumIdx.clear();
System.out.println("[INST]12;None;sumIdx.clear();"+sumIdx.clear());
            sumIdx.put(0.0, -1);
System.out.println("[INST]13;None;sumIdx.put(0.0, -1);"+sumIdx.put(0.0, -1));
            for (int i=0;i<n;i++) {
                sum += str[i] == c? 0.5: -0.5;
                Map.Entry<Double, Integer> lower = sumIdx.lowerEntry(sum);
System.out.println("[INST]16;lower;sumIdx.lowerEntry(sum);"+lower);
                if (lower != null) {
                    if (lower.getValue() == i - 1) lower = sumIdx.lowerEntry(lower.getKey());
System.out.println("[INST]18;None;lower.getValue();"+lower.getValue());
System.out.println("[INST]18;lower;sumIdx.lowerEntry(lower.getKey());"+lower);
System.out.println("[INST]18;None;lower.getKey();"+lower.getKey());
                    if (lower != null) {
                        System.out.println(lower.getValue() + 2 + " " + (i+1));
                        return;
                    }
                }
                sumIdx.putIfAbsent(sum, i);
System.out.println("[INST]24;None;sumIdx.putIfAbsent(sum, i);"+sumIdx.putIfAbsent(sum, i));
            }
        }
        System.out.println("-1 -1");
    }
}
