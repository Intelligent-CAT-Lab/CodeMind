import java.util.Scanner;
import java.time.LocalDate;

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

        LocalDate date = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        while (date.isBefore(endDate) || date.isEqual(endDate)) {
            if (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            date = date.plusDays(1);
        }

        System.out.println(a);
    }
}