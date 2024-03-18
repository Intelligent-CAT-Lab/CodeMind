import java.util.Scanner;
import java.lang.Math;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int rem;
        int ones;
        int[] string = new int[arr[1]];
        ones = arr[5] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string[i] = (int)Math.floor((double)arr[5] / arr[1]) + (ones > 0 ? 1 : 0);
            ones--;
        }
        if (arr[0] != arr[1]) {
            rem = arr[4] - arr[5];
            ones = rem % (arr[0] - arr[1]);
            string = java.util.Arrays.copyOf(string, arr[0]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string[i] = (int)Math.floor((double)rem / (arr[0] - arr[1])) + (ones > 0 ? 1 : 0);
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(" " + i + " \u25A1 "); // U+25A1 is the unicode for the white square, similar to the one in the Python code
        }
        System.out.println();
        sc.close();
    }
}