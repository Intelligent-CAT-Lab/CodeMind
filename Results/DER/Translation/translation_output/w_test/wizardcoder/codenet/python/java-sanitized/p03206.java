import java.util.Scanner;

public class p03206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        String[] days = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        String result = days[D-25];
        System.out.println(result);
    }
}