import java.util.*;
public class p02811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        System.out.println("Yes" if 500*K>=X else "No");
    }
}