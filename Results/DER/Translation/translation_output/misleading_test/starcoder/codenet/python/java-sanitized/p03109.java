import java.util.*;
public class p03109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("/");
        if (Integer.parseInt(date[0]) <= 2018) {
            System.out.println("Heisei");
        } else if (Integer.parseInt(date[0]) == 2019 && Integer.parseInt(date[1]) <= 4 && Integer.parseInt(date[2]) <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}