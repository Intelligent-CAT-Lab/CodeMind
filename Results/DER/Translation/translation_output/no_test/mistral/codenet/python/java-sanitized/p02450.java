import java.util.Arrays;
import java.util.stream.IntStream;

public class p02450 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = IntStream.range(1, n + 1).toArray();
        for (int[] p : permutations(arr)) {
            System.out.println(Arrays.toString(p));
        }
    }
}