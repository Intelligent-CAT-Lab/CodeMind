import java.util.Scanner;
import java.time.LocalDate;

public class p01040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int qq, q, a;
        int[] arr = new int[4];

        qq = y1 / 400;
        y1 += 400;
        qq--;
        q = (y2 - y1) / 400;
        y2 -= 400 * q;
        a = 688 * (q - qq);

        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        while (!date