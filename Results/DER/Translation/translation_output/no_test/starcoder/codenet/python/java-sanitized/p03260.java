import java.util.*;
public class p03260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Yes" if a % 2!= 0 && b % 2!= 0 else "No");
    }
}