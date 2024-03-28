import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : arr) {
            list.add(c);
        }
        Collections.sort(list);
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}


Next, it sorts the list of characters using the `Collections.sort()` method, which sorts the list in ascending order.