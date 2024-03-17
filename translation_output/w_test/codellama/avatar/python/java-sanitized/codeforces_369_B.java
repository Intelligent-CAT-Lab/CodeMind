import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = Integer.parseInt(arr[arr.length - 1]) % Integer.parseInt(arr[1]);
        for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
            string.add((int) Math.floor(Integer.parseInt(arr[arr.length - 1]) / Integer.parseInt(arr[1])) + (ones > 0 ? 1 : 0));
            ones--;
        }
        if (!arr[0].equals(arr[1])) {
            rem = Integer.parseInt(arr[arr.length - 2]) - Integer.parseInt(arr[arr.length - 1]);
            ones = rem % (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
            for (int i = Integer.parseInt(arr[1]); i < Integer.parseInt(arr[0]); i++) {
                string.add((int) Math.floor(rem / (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1])) + (ones > 0 ? 1 : 0)));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}