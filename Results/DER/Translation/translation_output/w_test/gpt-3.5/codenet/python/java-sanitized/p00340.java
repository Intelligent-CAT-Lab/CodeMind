import java.util.Arrays;
import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
        Arrays.sort(num);
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}