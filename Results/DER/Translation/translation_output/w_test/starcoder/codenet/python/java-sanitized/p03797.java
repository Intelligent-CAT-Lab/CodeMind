import java.util.*;
public class p03797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(s + ((c-s*2)//4)) if (s * 2 <= c) else System.out.println(c//2);
    }
}