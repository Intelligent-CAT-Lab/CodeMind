import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class p01040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.close();

        int qq = y1 / 400;
        y1 %= 400;
        y1 += 400;
        qq--;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate startDate = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        for (int i = 0; i <= daysBetween; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            if (currentDate.getDayOfMonth() == 13 && currentDate.getDayOfWeek().getValue() == 4) {
                a++;
            }
        }

        System.out.println(a);
    }
}