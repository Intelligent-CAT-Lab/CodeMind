import java.util.*;
public class p03109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("/");
        if (Integer.parseInt(s[0]) <= 2018) {
            System.out.println("Heisei");
        } else if (Integer.parseInt(s[0]) == 2019 && Integer.parseInt(s[1]) <= 4 && Integer.parseInt(s[2]) <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}