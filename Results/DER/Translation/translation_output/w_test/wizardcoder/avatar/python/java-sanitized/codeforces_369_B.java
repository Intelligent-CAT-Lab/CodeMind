import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int rem = 0;
        int ones = 0;
        String[] string = new String[arr[1]];
        ones = arr[5] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string[i] = String.format("%d", Math.floorDiv(arr[5], arr[1]) + (ones > 0? 1 : 0));
            ones--;
        }
        if (arr[0]!= arr[1]) {
            rem = arr[4] - arr[5];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string[i - arr[1]] = String.format("%d", Math.floorDiv(rem, arr[0] - arr[1]) + (ones > 0? 1 : 0));
                ones--;
            }
        }
        for (int i = 0; i < arr[1]; i++) {
            System.out.print(string[i] + " ");
        }
    }
}