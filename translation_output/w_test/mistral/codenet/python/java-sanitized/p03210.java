import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if (x.equals("7") || x.equals("5") || x.equals("3")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}