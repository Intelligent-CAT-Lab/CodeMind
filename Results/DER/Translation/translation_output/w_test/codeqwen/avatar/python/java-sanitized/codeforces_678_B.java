import java.util.Calendar;

public class codeforces_678_B {
    public static void main(String[] args) {
        int y = Integer.parseInt(System.console().readLine());
        boolean isRun = Calendar.getInstance().get(Calendar.YEAR) % 4 == 0;
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            Calendar cal = Calendar.getInstance();
            cal.set(y, 0, 1);
            if (cal.get(Calendar.YEAR) % 4 == 0 == isRun && cal.get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}