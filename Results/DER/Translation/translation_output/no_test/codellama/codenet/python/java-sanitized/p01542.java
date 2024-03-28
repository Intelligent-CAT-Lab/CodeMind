import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class p01542 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i] * 2;
        }
        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}