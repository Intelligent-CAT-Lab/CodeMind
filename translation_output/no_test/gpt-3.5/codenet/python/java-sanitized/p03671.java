import java.util.Arrays;
import java.util.Scanner;

public class p03671 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}