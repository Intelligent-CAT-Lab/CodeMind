import java.util.*;
import java.lang.*;

public class codeforces_369_B {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();

        int rem = 0;
        int ones = 0;
        ArrayList<Integer> string = new ArrayList<>();
        ones = arr.get(arr.size() - 1) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add((int)Math.floor((double)arr.get(arr.size() - 1) / arr.get(1)) + (ones > 0 ? 1 : 0));
            ones--;
        }
        if (!arr.get(0).equals(arr.get(1))) {
            rem = arr.get(arr.size() - 2) - arr.get(arr.size() - 1);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add((int)Math.floor((double)rem / (arr.get(0) - arr.get(1))) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + " ");
        }
    }
}