import java.util.*;
import java.time.*;

public class p01040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int qq = y1 / 400;
        y1 += 400;
        qq -= 1;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);
        LocalDate d = LocalDate.of(y1, m1, d1);

        while (d.isBefore(LocalDate.of(y2, m2, d2)) || d.isEqual(LocalDate.of(y2, m2, d2))) {
            if (d.getDayOfMonth() == 13 && d.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            d = d.plusDays(1);
        }
        System.out.println(a);
    }
}