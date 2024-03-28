import java.util.Calendar;

public class codeforces_678_B {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = 2096;

        boolean isLeap = calendar.isLeapYear(year);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK, Calendar.JANUARY, 1);
        
        while (true) {
            year++;
            if (calendar.isLeapYear(year) == isLeap && calendar.get(Calendar.DAY_OF_WEEK, Calendar.JANUARY, 1) == weekDay) {
                System.out.println(year);
                break;
            }
        }
    }
}