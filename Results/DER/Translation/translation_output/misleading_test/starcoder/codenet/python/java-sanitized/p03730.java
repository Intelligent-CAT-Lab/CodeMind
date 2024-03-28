import java.util.*;
public class p03730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = a % b;
        int i = m;
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(i)) {
            if(i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}