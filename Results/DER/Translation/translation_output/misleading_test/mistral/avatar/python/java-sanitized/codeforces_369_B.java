import java.util.ArrayList;
import java.util.List;

public class codeforces_369_B {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        String input = "1 1 1 1 1 1";
        String[] split = input.split(" ");
        for (String s : split) {
            arr.add(Integer.parseInt(s));
        }
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        ones = arr.get(arr.size() - 1) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add(Math.floor((double) arr.get(arr.size() - 1) / arr.get(1)) + (ones > 0));
            ones--;
        }
        if (arr.get(0) != arr.get(1)) {
            rem = arr.get(arr.size() - 2) - arr.get(arr.size() - 1);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add(Math.floor((double) rem / (arr.get(0) - arr.get(1)) + (ones > 0)));
                ones--;
            }
        }
        for (int i : string) {
            System.out.print(i + "  ");
        }
    }
}