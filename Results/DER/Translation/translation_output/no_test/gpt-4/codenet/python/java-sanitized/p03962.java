import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (String numStr : input) {
            uniqueNumbers.add(Integer.parseInt(numStr));
        }
        System.out.println(uniqueNumbers.size());
        scanner.close();
    }
}