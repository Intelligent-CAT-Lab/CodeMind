import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        int hour = S / 3600;
        int min = (S % 3600) / 60;
        int sec = (S % 3600 % 60);

        System.out.println(String.format("%d:%d:%d", hour, min, sec));
    }
}