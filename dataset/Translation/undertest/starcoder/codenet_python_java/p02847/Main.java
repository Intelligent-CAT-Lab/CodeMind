import java.util.*;
public class p02847 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Map<String,Integer> week = new HashMap<String,Integer>();
        week.put("SUN",0);
        week.put("MON",1);
        week.put("TUE",2);
        week.put("WED",3);
        week.put("THU",4);
        week.put("FRI",5);
        week.put("SAT",6);
        System.out.println(7-week.get(a));
    }
}