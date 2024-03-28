import java.util.Arrays;
import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x_list = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
                break;
            }
        }
    }
}