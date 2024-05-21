import java.util.*;

public class p03719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(B >= C && C >= A? "Yes" : "No");
    }
}