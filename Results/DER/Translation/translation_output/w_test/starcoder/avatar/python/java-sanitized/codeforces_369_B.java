import java.util.*;
public class codeforces_369_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int rem = 0, ones = 0;
        ArrayList<Integer> string = new ArrayList<Integer>();
        ones = arr[5] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string.add(Math.floorDiv(arr[5], arr[1]) + (ones > 0? 1 : 0));
            ones--;
        }
        if (arr[0]!= arr[1]) {
            rem = arr[5] - arr[4];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add(Math.floorDiv(rem, (arr[0] - arr[1])) + (ones > 0? 1 : 0));
                ones--;
            }
        }
        for (int i = 0; i < string.size(); i++) {
            System.out.print(string.get(i) + " ");
        }
    }
}