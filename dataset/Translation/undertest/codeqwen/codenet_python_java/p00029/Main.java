import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        
        Map<String, Integer> map = new HashMap<>();
        for (String s : a) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        String maxByCount = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        String maxByLength = Arrays.stream(a).max(Comparator.comparingInt(String::length)).get();
        
        System.out.println(maxByCount + " " + maxByLength);
    }
}