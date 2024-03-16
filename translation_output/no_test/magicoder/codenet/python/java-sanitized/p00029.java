import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");

        Map<String, Integer> countMap = new HashMap<>();
        for (String s : a) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        String maxCountWord = Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        Arrays.sort(a, (s1, s2) -> s2.length() - s