import java.util.*;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k*(k-1)*(int)Math.pow((n-1),k-2));
    }
}