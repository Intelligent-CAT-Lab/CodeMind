import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class p03469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
        date = date.plusYears(1);
        System.out.println(date.format(formatter));
    }
}