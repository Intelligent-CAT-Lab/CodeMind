import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        int rem = 0;
        int ones = arr[arr.length - 1] % arr[1];
        ArrayList<Integer> string = new ArrayList<>();
        
        for (int i = 0; i < arr[1]; i++) {
            string.add((arr[arr.length - 1] / arr[1]) + (ones > 0 ? 1 : 0));
            ones--;
        }
        
        if (arr[0] != arr[1]) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add((rem / (arr[0] - arr[1])) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        
        for (int i : string) {
            System.out.print(i + " \u2581 ");
        }
        scanner.close();
    }
}