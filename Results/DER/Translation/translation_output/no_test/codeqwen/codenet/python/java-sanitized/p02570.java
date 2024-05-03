import java.util.Arrays;
import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] data = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        
        if (data[0] / (double) data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}