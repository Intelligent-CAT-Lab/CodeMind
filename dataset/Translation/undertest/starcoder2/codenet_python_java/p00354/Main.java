import java.util.Scanner;

public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] day = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int a = x % 7;
        if (a == 2 || a == 3) {
            System.out.println(day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(day[a + 3]);
        }
    }
}