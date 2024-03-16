import java.util.*;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        Collections.sort(numbers, Collections.reverseOrder());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}