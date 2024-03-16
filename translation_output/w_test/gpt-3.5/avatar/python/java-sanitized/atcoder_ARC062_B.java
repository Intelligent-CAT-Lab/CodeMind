import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ARC062_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().trim().split(" ");
        String S = input[0];

        Map<Character, Integer> counter = new HashMap<>();
        for (char c : S.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        int result = (counter.getOrDefault('g', 0) - counter.getOrDefault('p', 0)) / 2;
        System.out.println(result);
    }
}