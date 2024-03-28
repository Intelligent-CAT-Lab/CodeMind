import java.util.*;
public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("abcd" + "abcd" * (n / 4) + "abcd" + "abcd" * (n % 4));
    }
}