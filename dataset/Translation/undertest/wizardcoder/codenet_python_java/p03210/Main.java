import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        String ans;
        if (X == 7 || X == 5 || X == 3) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}