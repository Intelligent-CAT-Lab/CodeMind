import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (String number : numbers) {
            uniqueNumbers.add(Integer.parseInt(number));
        }
        System.out.println(uniqueNumbers.size());
    }
}