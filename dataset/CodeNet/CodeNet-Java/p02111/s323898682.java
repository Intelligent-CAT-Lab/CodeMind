import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}
