import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p03962 {
    public static void main(String[] args) {
        String input = "1 2 3 4 5 1 2 3 4 5"; // replace with actual input
        String[] numbers = input.split(" ");
        Set<Integer> set = new HashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        System.out.println(set.size());
    }
}