import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class p03469 {
    public static void main(String[] args) {
        String inputDate = "2017/01/07";
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate newDate = date.plus(1, ChronoUnit.YEARS);
        System.out.println(newDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    }
}