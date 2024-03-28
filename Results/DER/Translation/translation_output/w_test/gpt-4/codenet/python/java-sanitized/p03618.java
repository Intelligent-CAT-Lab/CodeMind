import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalInput = scanner.nextLine();
        char[] s = originalInput.toCharArray();
        Arrays.sort(s);
        Map<Character,Integer> freqMap = new HashMap<>();

        for (char c : s) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int l = s.length;
        long res = ((long) l * (l - 1) / 2) + 1;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int p = entry.getValue();
            res -= ((long) p * (p - 1) / 2);
        }
        System.out.println(res);
    }
}