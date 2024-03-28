import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = Arrays.asList(sc.nextLine().split(" "));
        System.out.println(Collections.max(a, Comparator.comparingInt(a::indexOf)));
        System.out.println(Collections.max(a, Comparator.comparingInt(String::length)));
    }
}