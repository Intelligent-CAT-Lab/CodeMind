import java.util.*;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int rem = 0;
        int ones = 0;
        StringBuilder sb = new StringBuilder();
        ones = arr[arr.length - 1] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            sb.append(Math.floor(arr[arr.length - 1] / arr[1]) + (ones > 0) + " ");
            ones -= 1;
        }
        if (!arr[0] == arr[1]) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                sb.append(Math.floor(rem / (arr[0] - arr[1])) + (ones > 0) + " ");
                ones -= 1;
            }
        }
        System.out.println(sb.toString().trim());
    }
}