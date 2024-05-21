import java.util.Scanner;

public class p02847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] week = {0, 1, 2, 3, 4, 5, 6};

        int index = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(a)) {
                index = i;
                break;
            }
        }

        System.out.println(7 - week[index]);
    }
}