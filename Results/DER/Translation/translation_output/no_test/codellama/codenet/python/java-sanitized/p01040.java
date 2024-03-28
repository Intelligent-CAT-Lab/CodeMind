import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class p01040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.close();

        LocalDate startDate = LocalDate.of(y1, m1, d1);
        LocalDate endDate = LocalDate.of(y2, m2, d2);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long thursdaysBetween = 0;

        for (int i = 0; i < daysBetween; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            if (currentDate.getDayOfMonth() == 13 && currentDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
                thursdaysBetween++;
            }
        }

        System.out.println(thursdaysBetween);
    }
}