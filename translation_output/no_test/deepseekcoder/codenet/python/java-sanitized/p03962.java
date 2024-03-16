import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        System.out.println(set.size());
    }
}