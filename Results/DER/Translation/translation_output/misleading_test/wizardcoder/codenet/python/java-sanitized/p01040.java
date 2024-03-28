import java.time.LocalDate;
import java.time.Year;
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

        int qq = (y1 - 1) / 400;
        int q = (y2 - y1) / 400;
        int a = 688 * (q - qq);

        LocalDate startDate = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfMonth() == 13 && startDate.getDayOfWeek().getValue() == 5) {
                a++;
            }
            startDate = startDate.plusDays(1);
        }

        System.out.println(a);
    }
}