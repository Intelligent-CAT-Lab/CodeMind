import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String s : input) {
            set.add(s);
        }
        System.out.println(set.size());
    }
}