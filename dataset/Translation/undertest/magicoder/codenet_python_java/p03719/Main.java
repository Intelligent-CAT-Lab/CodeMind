import java.util.*;

public class p03719 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(B >= C && C >= A ? "Yes" : "No");
    }
}