import java.util.Scanner;

public class p02390 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ss = sc.nextInt();
        int hour = ss / 60 / 60;
        int minute = (ss - hour * 60 * 60) / 60;
        int second = ss - hour * 60 * 60 - minute * 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}