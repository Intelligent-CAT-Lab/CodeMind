import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class p01829 {
    static final long INF = Long.MAX_VALUE;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = reader.readLine();
        System.out.println(getClosestPermutation(input));
    }

    static String getClosestPermutation(String s) {
        int l = s.length();
        int n = Integer.parseInt(s);
        long m = INF;
        String r = "";
        long t = (long) Math.pow(10, l);
        int[] digits = s.chars().map(Character::getNumericValue).toArray();
        Arrays.sort(digits);

        do {
            // Convert the array of digits to a number
            long b = 0;
            for (int digit : digits) {
                b = b * 10 + digit;
            }
            long tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining(""));
            }
        } while (nextPermutation(digits));

        return r;
    }

    // Helper function to generate the next lexicographic permutation
    static boolean nextPermutation(int[] array) {
        // Find the longest non-increasing suffix and find the pivot
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        // Find rightmost successor to the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }
        // Swap the successor with the pivot
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;
        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}