import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> S = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (S.indexOf(Collections.max(S)) == 0) {
            System.out.println("A");
        } else if (S.indexOf(Collections.max(S)) == 1) {
            System.out.println("B");
        } else if (S.indexOf(Collections.max(S)) == 2) {
            System.out.println("C");
        }
    }
}