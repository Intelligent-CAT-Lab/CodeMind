import java.util.Scanner;

public class p02847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();

        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < week.length; i++) {
            if (week[i].equals(a)) {
                System.out.println(7 - i);
                break;
            }
        }
    }
}