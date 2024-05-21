import java.util.*;

public class p03962 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers.size());
    }
}