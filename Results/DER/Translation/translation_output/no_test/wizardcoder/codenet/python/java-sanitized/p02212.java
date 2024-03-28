import java.util.Arrays;
import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(Math.abs((arr[0] + arr[3]) - (arr[1] + arr[2])));
    }
}