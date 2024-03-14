import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        int start = 0;
        List<String> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < numbers.get(0); i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < numbers.get(0); j++) {
                if (count < numbers.get(1)) {
                    if (j == next) {
                        string.append(" L");
                        count++;
                        next += 2;
                        if (next >= numbers.get(0)) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        string.append(" S");
                    }
                } else {
                    string.append(" S");
                }
            }
            arr.add(string.toString());
        }
        if (count < numbers.get(1)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String i : arr) {
                System.out.println(i);
            }
        }
    }
}