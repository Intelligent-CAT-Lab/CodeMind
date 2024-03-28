import java.util.*;
import java.util.stream.Collectors;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        int l = s.length();
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        long res = l * (l - 1) / 2 + 1;
        for (long v : map.values()) {
            res -= v * (v - 1) / 2;
        }
        System.out.println(res);
    }
}