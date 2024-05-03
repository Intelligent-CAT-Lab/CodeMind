import java.util.Arrays;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        String s = Arrays.toString(sortArray(input()));
        if (s.equals("[a, a, b, b]") && s.equals("[c, c, d, d]") && !s.equals("[a, a, b, b]")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static char[] input() {
        // This is a placeholder for the actual input logic.
        // In a real scenario, you would read from the console or any other source.
        return new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd'};
    }

    public static char[] sortArray(char[] array) {
        Arrays.sort(array);
        return array;
    }
}