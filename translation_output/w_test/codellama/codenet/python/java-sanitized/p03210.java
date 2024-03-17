import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 7 || X == 5 || X == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}