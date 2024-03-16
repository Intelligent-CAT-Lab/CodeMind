import java.util.*;
import java.io.*;

public class atcoder_ARC062_B {
    static Scanner sc = new Scanner(System.in);
    static int limit = 100000000;

    static int[] pin(int type) {
        String[] input = sc.nextLine().split(" ");
        int[] result = new int[type];
        for (int i = 0; i < type; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }

    static List<Integer> lispin(int type) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < type; i++) {
            result.add(pin(type)[i]);
        }
        return result;
    }

    static void resolve() {
        String S = sc.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            c.put(S.charAt(i), c.getOrDefault(S.charAt(i), 0) + 1);
        }
        int result = (c.get("g") - c.get("p")) / 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        resolve();
    }
}