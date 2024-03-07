import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] listN = String.valueOf(n).split("");
        int num = 0;

        for (String i : listN) {
            num += Integer.parseInt(i);
        }

        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}