import java.util.Arrays;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        String input = "1 2 3 0 5";
        String[] splitInput = input.split(" ");
        int[] a = Arrays.stream(splitInput).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}