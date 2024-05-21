import java.util.Arrays;
import java.util.Scanner;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length());
        System.out.println(a[0]);
        Arrays.sort(a, (s1, s2) -> s2.compareTo(s1));
        System.out.println(a[0]);
    }
}