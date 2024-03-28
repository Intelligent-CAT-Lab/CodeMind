import java.util.Arrays;
import java.util.Scanner;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (String s : a) {
            int count = a.length - a.indexOf(s);
            int len = s.length();
            if (count > max1) {
                max2 = max1;
                max1 = count;
            } else if (count > max2) {
                max2 = count;
            }
            if (len > max2) {
                max1 = len;
                max2 = len;
            }
        }
        System.out.println(max1 + " " + max2);
    }
}