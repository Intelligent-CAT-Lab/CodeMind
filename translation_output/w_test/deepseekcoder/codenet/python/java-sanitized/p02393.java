import java.util.Arrays;
import java.util.Scanner;

public class p02393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[3];
        s[0] = scanner.nextInt();
        s[1] = scanner.nextInt();
        s[2] = scanner.nextInt();
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}