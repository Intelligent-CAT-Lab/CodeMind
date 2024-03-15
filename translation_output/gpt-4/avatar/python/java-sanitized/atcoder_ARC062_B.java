import java.io.*;
import java.util.*;
import java.util.stream.*;

public class atcoder_ARC062_B {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return reader.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int[] pin() {
        return Arrays.stream(readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public static List<Integer> lispin() {
        return Arrays.stream(readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static void resolve() {
        String S = readLine();
        Map<Character, Long> countMap = S.chars().boxed()
                .collect(Collectors.groupingBy(k -> (char) k.intValue(), Collectors.counting()));
        
        long gCount = countMap.getOrDefault('g', 0L);
        long pCount = countMap.getOrDefault('p', 0L);
        System.out.println((gCount - pCount) / 2);
    }

    public static void main(String[] args) {
        // Increase the stack size programmatically if needed, not directly supported in Java as in Python.
        new Thread(null, Main::resolve, "resolve", 1<<26).start();
    }
}