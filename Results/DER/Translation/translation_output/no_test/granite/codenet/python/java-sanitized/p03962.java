import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class p03962 {
    public static void main(String[] args) {
        String input = "1 2 3 4 5";
        List<Integer> numbers = Arrays.stream(input.split(" "))
               .map(Integer::parseInt)
               .collect(Collectors.toList());
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers.size());
    }
}