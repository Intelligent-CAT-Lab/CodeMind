import java.util.*;
import java.time.*;

public class p01040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int qq = y1 / 400;
        y1 = y1 % 400 + 400;
        qq--;
        int q = (y2 - y1) / 400;
        y2 = y2 - 400 * q;
        int a = 688 * (q - qq);

        LocalDate d = LocalDate.of(y1, m1, d1);
        while (d.isBefore(LocalDate.of(y2, m2, d2))) {
            if (d.getDayOfMonth() == 13 && d.getDayOfWeek().getValue() == 4) {
                a++;
            }
            d = d.plusDays(1);
        }

        System.out.println(a);
    }
}