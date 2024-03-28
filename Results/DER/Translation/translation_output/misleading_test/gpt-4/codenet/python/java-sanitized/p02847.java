import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class p02847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();

        Map<String, Integer> week = new HashMap<>();
        week.put("SUN", 0);
        week.put("MON", 1);
        week.put("TUE", 2);
        week.put("WED", 3);
        week.put("THU", 4);
        week.put("FRI", 5);
        week.put("SAT", 6);

        System.out.println(7 - week.get(a));
        
        scanner.close();
    }
}