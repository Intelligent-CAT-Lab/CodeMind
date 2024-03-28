import java.util.Scanner;
import java.util.Arrays;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sortedString.append(arr[i]);
        }
        String sortedS = sortedString.toString();

        int l = sortedS.length();
        int res = l * (l - 1) / 2 + 1;

        for (int i = 0; i < l; i++) {
            int count = 1;
            while (i < l - 1 && sortedS.charAt(i) == sortedS.charAt(i + 1)) {
                count++;
                i++;
            }
            res -= count * (count - 1) / 2;
        }

        System.out.println(res);
    }
}