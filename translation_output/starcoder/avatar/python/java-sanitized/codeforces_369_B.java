import java.util.*;
public class codeforces_369_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }
        int rem = 0, ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = arr[1] % arr[0];
        for (int i = 0; i < arr[0]; i++) {
            string.add(Math.floorDiv(arr[1], arr[0]) + (ones > 0? 1 : 0));
            ones--;
        }
        if (arr[0]!= arr[1]) {
            rem = arr[1] - arr[0];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add(Math.floorDiv(rem, (arr[0] - arr[1])) + (ones > 0? 1 : 0));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}