import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (Arrays.stream(ABC).filter(i -> i == 5).count() == 2) {
            System.out.println(Arrays.stream(ABC).sum() == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}