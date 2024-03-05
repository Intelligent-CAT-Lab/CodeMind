import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}
